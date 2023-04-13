package org.example.database.dao;

import org.example.database.entity.Employee;
import org.example.database.entity.UserRoles;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface UserRolesDAO extends JpaRepository<UserRoles, Long> {

    List<UserRoles> findByUserId(Integer id);
}
