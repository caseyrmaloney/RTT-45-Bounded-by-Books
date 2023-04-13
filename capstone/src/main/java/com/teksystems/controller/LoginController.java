package com.teksystems.controller;

import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.servlet.ModelAndView;


@Controller
@Slf4j

public class LoginController {

    @GetMapping("/login/login")
    public ModelAndView setup(HttpSession session) {

        ModelAndView response = new ModelAndView("login/login");

        log.debug("In the login Controller");


        return response;
    }
}
