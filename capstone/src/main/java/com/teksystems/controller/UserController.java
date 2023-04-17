package com.teksystems.controller;

import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
public class UserController {

    @GetMapping("/user/profile")
    public ModelAndView profile(HttpSession session) {
        log.debug("In the user profile controller");
        ModelAndView response = new ModelAndView("user/profile");

        return response;
    }











}
