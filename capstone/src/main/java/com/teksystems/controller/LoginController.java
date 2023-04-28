package com.teksystems.controller;

import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.servlet.ModelAndView;


/**
 * Login Controller to get the setup and returns the login page
 */

@Controller
@Slf4j

public class LoginController {

    /**
     *
     * @param session
     * @return
     * gets mapping for the login page
     * returns the jsp page for the login
     */
    @GetMapping("/login/login")
    public ModelAndView setup(HttpSession session) {

        ModelAndView response = new ModelAndView("login/login");

        log.debug("In the login Controller");


        return response;
    }
}
