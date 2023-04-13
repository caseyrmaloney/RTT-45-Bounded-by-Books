package com.teksystems.database.dao;

import com.teksystems.database.entity.UserRoles;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface UserRolesDAO extends JpaRepository<UserRoles, Long> {

    List<UserRoles> findByUserId(Integer id);
}
