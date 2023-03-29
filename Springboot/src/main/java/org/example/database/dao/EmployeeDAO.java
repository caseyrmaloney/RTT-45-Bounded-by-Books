package org.example.database.dao;

import org.example.database.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

                                                // entity name, PK
public interface EmployeeDAO extends JpaRepository<Employee, Long> {

    @Query("FROM Employee e")
    List<Employee> getAllEmployees();


    //List<Employee> findByFirstNameOrLastName(String firstName, String lastName);

    List<Employee> findByFirstNameContainingOrLastNameContaining(String firstName, String lastName);

     // List<Employee> findByFirstName (String firstName);
     // List<Employee> findByLastName (String lastName);

//        List<Employee> findByFirstNameAndLastName(String firstName, String lastName);

                                                    //% is contains the character
//    @Query(value="select * from employees where firstname like %:firstName% or lastname like %:lastName%", nativeQuery = true)
//    List<Employee> usingANativeQuery(String firstName, String lastName);


//    @Query("Select e from Employee e where e.firstName like %:firstName% or e.lastName like %:lastName% ")
//    List<Employee> usingJPAQuery(String firstName, String lastName);


}