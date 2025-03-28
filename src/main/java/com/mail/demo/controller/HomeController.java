package com.mail.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller; 
import com.mail.demo.service.*;
import org.springframework.beans.factory.annotation.Value;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.mail.*;
import java.util.*;
@Controller
public class HomeController {


     @Autowired
      private EmailSenderService mailSenderService;
  
    @RequestMapping("/")
    public String home() {
         return "home";
    }

    @RequestMapping("/inbox")
    public String inbox() {
         return "inbox";
    }

     @RequestMapping("/compose")
     public String compose() {
        return "compose";
     }

}