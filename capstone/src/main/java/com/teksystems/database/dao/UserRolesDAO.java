package com.teksystems.database.dao;

import com.teksystems.database.entity.UserRoles;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

/**
 * user roles dao that returns from the user roles database
 */
public interface UserRolesDAO extends JpaRepository<UserRoles, Long> {

    /**
     *
     * @param id
     * @return
     * returns a list of user roles by the user id
     */
    List<UserRoles> findByUserId(Integer id);
}
