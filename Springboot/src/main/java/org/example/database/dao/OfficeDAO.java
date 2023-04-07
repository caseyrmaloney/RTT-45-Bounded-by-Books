package org.example.database.dao;

import org.example.database.entity.Employee;
import org.example.database.entity.Office;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OfficeDAO extends JpaRepository<Employee, Long> {

    @Query("FROM Office o order by o.city asc")
    List<Office> getAllOffices();
}
