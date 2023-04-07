package org.example.controller;



import io.micrometer.common.util.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.example.database.dao.OfficeDAO;
import org.example.database.entity.Employee;
import org.example.database.entity.Office;
import org.example.formbeans.EmployeeFormBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.example.database.dao.EmployeeDAO;


import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping ("/employee")
@Slf4j
public class EmployeeController {

    //spring contents hold everything that spring has and works with and take anything and auto wire it to anything you want
    //goes and find the object and second pass auto wired into all of the different class
    //third pass is all post construct - after everything id created and wired and it a delayed constructor way to insisalize your class
    //constructors are not used with spring boot
    @Autowired
    private EmployeeDAO employeeDAO;

    @Autowired
    private OfficeDAO officeDAO;

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public ModelAndView create() {
        log.debug("in the create controller");
        ModelAndView response = new ModelAndView("employee/create");


        List<Office> offices = officeDAO.getAllOffices();
        response.addObject("offices" , offices);

        return response;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable Integer id) {
        log.debug("in the edit employee controller");
        ModelAndView response = new ModelAndView("employee/create");

        Employee emp = employeeDAO.findById(id);
        EmployeeFormBean form = new EmployeeFormBean();

        form.setId(emp.getId());
        form.setFirstName(emp.getFirstName());
        form.setLastName(emp.getLastName());
        form.setEmail(emp.getEmail());
        form.setJobTitle(emp.getJobTitle());
        form.setExtension(emp.getExtension());
        form.setVacationHours(emp.getVacationHours());
        form.setOfficeId(emp.getOfficeId());
        form.setProfileImg(emp.getProfileImg());

        response.addObject("form", form);

        List<Office> offices = officeDAO.getAllOffices();
        response.addObject("offices" , offices);

        return response;
    }

    @GetMapping("createSubmit")
    public ModelAndView createSubmit(EmployeeFormBean form) {
        log.debug("in the create submit controller");
        ModelAndView response = new ModelAndView("employee/create");
        log.debug("!!!!!!!!!!!!!!!!!!!!---- create submit controller");
        log.debug(form.toString());

        Employee emp = new Employee();

        if(form.getId() != null && form.getId() > 0) {
            emp = employeeDAO.findById(form.getId());
        }

        emp.setFirstName(form.getFirstName());
        emp.setLastName(form.getFirstName());
        emp.setEmail(form.getEmail());
        emp.setJobTitle(form.getJobTitle());
        emp.setExtension(form.getExtension());
        emp.setVacationHours(form.getVacationHours());
        emp.setOfficeId(form.getOfficeId());
        emp.setProfileImg(form.getProfileImg());

        response.addObject("form", form);

        employeeDAO.save(emp);
        return response;
    }

    @GetMapping("/detail/{id}")
    //the path varaible is what is shown in the URL
    public ModelAndView detail(@PathVariable Integer id){
        ModelAndView response = new ModelAndView("employee/detail");
        log.debug("In employee detail controller method with id = " + id);

        Employee employee = employeeDAO.findById(id);

        response.addObject("employee", employee);

        log.debug(employee + "");
        return response;
    }


    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public ModelAndView employeeSearch(@RequestParam(required=false) String firstName, @RequestParam(required=false) String lastName) {
        log.debug("In the employee search controller method with firstName = " + firstName + " lastName = " + lastName);

        ModelAndView response = new ModelAndView("employee/search");

        // by this line of code we are assuming both are empty thus creating a new list with no search results
        // it has no results because there are no values coming.
        List<Employee> employees = new ArrayList<>();

        // check if both firstName and lastName have a value
        if (!StringUtils.isEmpty(firstName) && !StringUtils.isEmpty(lastName)) {
            // if so run the qurey that works with both values
            log.debug("Both first name and last name have a value");
            employees = employeeDAO.findByFirstNameContainingOrLastNameContainingIgnoreCase(firstName, lastName);
        }

        // check if the first name is not empty and the last name is empty
        if (!StringUtils.isEmpty(firstName) && StringUtils.isEmpty(lastName)) {
            // we run our query that checks the fist name field only
            log.debug("First name has a value and last name is empty");
            employees = employeeDAO.findByFirstNameContainingIgnoreCase(firstName);
        }

        // check if the first name is empty and the last name is not empty
        if (StringUtils.isEmpty(firstName) && !StringUtils.isEmpty(lastName)) {
            // we run our query that checks the last name field only
            log.debug("Last name has a value and first name is empty");
            employees = employeeDAO.findByLastNameContainingIgnoreCase(lastName);
        }


        //addObject ()-- attributeName - name of the object to add to the model (never null)
        //attributeValue - object to add to the model (can be null)
        response.addObject("employeesList", employees);
        response.addObject("firstName",firstName);
        response.addObject("lastName",lastName);

        return response;
    }
}
