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
      private EmailService mailService;
      @Value("${spring.mail.username}")
      private String from;

    @RequestMapping("/")
    public ModelAndView home() {
         ModelAndView mv = new ModelAndView();
         mv.setViewName("main.jsp");
         mv.addObject("hdr", "Inbox");
         return mv;
    }

    @RequestMapping("/inbox")
    public ModelAndView gohome() {
         ModelAndView mv = new ModelAndView();
         List<Message> list = mailService.configureInbox();
         mv.setViewName("main.jsp");
         mv.addObject("hdr", "Inbox");
         mv.addObject("list",list);
         return mv;
    }

    @RequestMapping("/send")
    public ModelAndView send(String to, String subject, String message) {
        
          ModelAndView mv = new ModelAndView();
          mailService.sendMail(to,subject,message);
          mv.setViewName("main.jsp");
          return mv;
    }

     @RequestMapping("/compose")
     public ModelAndView compose() {
         ModelAndView mv = new ModelAndView();
          mv.addObject("fromId",from);
          mv.setViewName("compose.jsp");
          return mv;
     }

}