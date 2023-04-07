package com.teksystems.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
public class SlashController {

    /**
     *   method to handel incoming request
     *   setting up the index.html on the URl this method is going to run
     *   .GET only respond to get requests
     *   ModelandView spring uses to build the dynamic jsp page , name of the view
     *   is the name of the jsp file without jsp
     *
     * **/

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView index() {
        log.info("in the index controller");
        ModelAndView response = new ModelAndView("index");
        return response;
    }

    @RequestMapping(value = "/user/login", method = RequestMethod.GET)
    public ModelAndView login() {
        log.info("in the login controller");
        ModelAndView response = new ModelAndView("user/login");
        return response;
    }

    @RequestMapping(value = "/aboutUs", method = RequestMethod.GET)
    public ModelAndView aboutUs() {
        log.info("in the about us  controller");
        ModelAndView response = new ModelAndView("aboutUs");
        return response;
    }



}










