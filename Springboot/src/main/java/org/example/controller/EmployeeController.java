package org.example.controller;



import lombok.extern.slf4j.Slf4j;
import org.example.database.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.example.database.dao.EmployeeDAO;

import java.util.List;

@Controller
@Slf4j
public class EmployeeController {

    //spring contents hold everything that spring has and works with and take anything and auto wire it to anything you want
    //goes and find the object and second pass auto wired into all of the different class
    //third pass is all post construct - after everything id created and wired and it a delayed constructor way to insisalize your class
    //constructors are not used with spring boot
    @Autowired
    private EmployeeDAO employeeDAO;

    @RequestMapping(value = "/employee-search", method = RequestMethod.GET)
    public ModelAndView employeeSearch(@RequestParam(required=false) String firstName, @RequestParam(required=false) String lastName) {

        log.info("In the employee search controller method with search " + firstName + lastName);
                                                        // miminks the folder structure
        ModelAndView response = new ModelAndView("employee/employee-search");

        List<Employee> employees = employeeDAO.findByFirstNameContainingOrLastNameContaining(firstName, lastName);

        //addObject ()-- attributeName - name of the object to add to the model (never null)
        //attributeValue - object to add to the model (can be null)
        response.addObject("employeesList", employees);
        response.addObject("firstName",firstName);
        response.addObject("lastName",lastName);

        return response;
    }
}
