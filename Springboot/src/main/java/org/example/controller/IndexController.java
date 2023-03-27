package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
        log.info("in the index controller");
        ModelAndView response = new ModelAndView("index");
        return response;
    }

    @RequestMapping(value = "/signup.html", method = RequestMethod.GET)
    public ModelAndView signUp() {
        log.info("in the index controller");
        ModelAndView response = new ModelAndView("signup");
        return response;
    }
}
