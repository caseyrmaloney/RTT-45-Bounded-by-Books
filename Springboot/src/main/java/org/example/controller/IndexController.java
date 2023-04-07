package org.example.controller;

import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.example.formbeans.UserFormBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.example.database.dao.EmployeeDAO;

@Controller
@Slf4j
public class IndexController {


    /**
     *   method to handel incoming request
     *   setting up the index.html on the URl this method is going to run
     *   .GET only respond to get requests
     *   ModelandView spring uses to build the dynamic jsp page , name of the view
     *   is the name of the jsp file without jsp
     *
     * **/

    @RequestMapping(value = "/index.html", method = RequestMethod.GET)
    public ModelAndView index() {
        log.debug("in the index controller");
        ModelAndView response = new ModelAndView("index");
        return response;
    }

    @GetMapping("/signup")
    public ModelAndView setup(HttpSession session) {
        log.debug("In the signup controller method");
        ModelAndView response = new ModelAndView("signup");

        log.debug("Signup method in the controller is setting a value in the session");
        session.setAttribute("name", "signup set this value");

        return response;
    }

    @PostMapping("/signup")
    public ModelAndView setup(UserFormBean form) {

        ModelAndView response = new ModelAndView("signup");
        log.debug("In the signup controller post method");

        log.debug(form.toString());

        return response;
    }



}
