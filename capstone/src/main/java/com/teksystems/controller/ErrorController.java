package com.teksystems.controller;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * error controller handels the 404 and 500 errors to display the error on the page with user functionality still enabled
 * displays the 500 and 404 pages
 */
@Slf4j
@Controller
@ControllerAdvice
public class ErrorController {

    // !!!!! CHANGE THIS TO YOUR PACKAGE NAME
    private static final String PACKAGE_NAME = "teksystems";


    /**
     *
     * @param request
     * @param ex
     * @return
     * handles the error for the 500
     * filters through the error message to display what is the actual error and displays the error through the jsp page
     */
    @ExceptionHandler(Exception.class)
    public ModelAndView handleAllException(HttpServletRequest request, Exception ex) {
        String requestUrl = getRequestURL(request);
        log.warn("Error page exception happened on URL : " + requestUrl, ex);

        String htmlStackTrace = getHTMLStackTrace(ExceptionUtils.getStackFrames(ex));

        ModelAndView model = new ModelAndView("/error/500");

        String stackTrace = getHTMLStackTrace(ExceptionUtils.getStackFrames(ex));

        // message is the request URL if it was an error page, otherwise it can be a message
        // from the class that calls it
        model.addObject("requestUrl", requestUrl);
        model.addObject("message", ex.getMessage());
        model.addObject("stackTrace", stackTrace);

        if (ex.getCause() != null) {
            model.addObject("rootcause", ExceptionUtils.getRootCause(ex));

            String roottrace = getHTMLStackTrace(ExceptionUtils.getRootCauseStackTrace(ex));
            model.addObject("roottrace", roottrace);
        }

        return model;
    }

    /**
     *
     * @param stack
     * @return
     * handles the stack trace error to display the actual error, filters through the entire error so it display just small amount
     */
    private String getHTMLStackTrace(String[] stack) {
        StringBuffer result = new StringBuffer();
        for (String frame : stack) {
            if (frame.contains(PACKAGE_NAME)) {
                result.append(" &nbsp; &nbsp; &nbsp;" + frame.trim().substring(3) + "<br>\n");
            } else if (frame.contains("Caused by:")) {
                result.append("Caused By:<br>");
            }
        }

        return result.toString();
    }

    /**
     *
     * @param request
     * @return
     * handles the URL for the error
     */
    public String getRequestURL(HttpServletRequest request) {
        String result = request.getRequestURL().toString();
        if (request.getQueryString() != null) {
            result = result + "?" + request.getQueryString();
        }

        return result;
    }

}