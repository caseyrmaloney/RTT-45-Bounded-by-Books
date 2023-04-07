package org.example.controller;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import io.micrometer.common.util.StringUtils;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.IOException;

@Controller
@Slf4j
public class FileUploadController {

    @GetMapping("/fileUpload")
    public ModelAndView fileUpload() throws IOException {
        ModelAndView response = new ModelAndView("fileUpload");

        return response;
    }

    @PostMapping("/fileUpload")
    public ModelAndView fileUpload(@RequestParam("fileUpload") MultipartFile file) throws IOException {
        ModelAndView response= new ModelAndView("fileUpload");

        log.debug("in the file upload controller");
        
        File target = new File ("./src/main/webapp/pub/images");
        log.debug(target.getAbsolutePath());
        FileUtils.copyInputStreamToFile(file.getInputStream(), target);

        response.addObject("fileUrl", "/pub/images" + file.getOriginalFilename());

        return response;

    }
}
