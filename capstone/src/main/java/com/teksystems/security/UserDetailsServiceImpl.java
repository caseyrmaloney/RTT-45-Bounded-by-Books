package com.teksystems.security;

import com.teksystems.database.dao.UserDAO;
import com.teksystems.database.dao.UserRolesDAO;
import com.teksystems.database.entity.User;
import com.teksystems.database.entity.UserRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.*;

/**
 * user details service that loads the current user and authenticated them
 */
@Service
public class UserDetailsServiceImpl  implements UserDetailsService {

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private UserRolesDAO userRolesDAO;

    /**
     *
     * @param username
     * @return
     * @throws UsernameNotFoundException
     * this first checks if the user is not found in the database (if it was found the user object would be not null)
     * UsernameNotFoundException is part of Spring Security and tell spring that the use was not found
     * it also stops the code from executing any further
     * these are used for advanced authentication features that we are not going to use
     * load the user roles from the database by the userid ( which we queried above by the username )
     * create the spring security user roles based on the ones we queried from the database
     * this is authorization part of spring security which allows some users access to secured parts of the application
     * return a spring security user object that contains all of the information we gathered, it will be used
     * by spring security to determine if the authentication is successful
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDAO.findByEmail(username);

        if (user == null) {
            throw new UsernameNotFoundException("Username " + username + " not found in the database");
        }

        // these are used for advanced authentication features that we are not going to use
        boolean accountIsEnabled = true;
        boolean accountNonExpired = true;
        boolean credentialsNonExpired = true;
        boolean accountNonLocked = true;

        List<UserRoles> userRoles = userRolesDAO.findByUserId(user.getId());
        Collection<? extends GrantedAuthority> springRoles = buildGrantAuthorities(userRoles);

        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(),
                accountIsEnabled, accountNonExpired, credentialsNonExpired, accountNonLocked, springRoles);

    }

    private Collection<? extends GrantedAuthority> buildGrantAuthorities(List<UserRoles> userRoles) {
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

        for (UserRoles role : userRoles) {
            authorities.add(new SimpleGrantedAuthority(role.getRoleName()));
        }

        return authorities;
    }
}

