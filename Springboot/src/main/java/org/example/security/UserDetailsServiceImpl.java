package org.example.security;

import org.example.database.dao.UserDAO;
import org.example.database.dao.UserRolesDAO;
import org.example.database.entity.User;
import org.example.database.entity.UserRoles;
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

@Service
public class UserDetailsServiceImpl  implements UserDetailsService {

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private UserRolesDAO userRolesDAO;

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
