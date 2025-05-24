package com.mail.demo.controller;

<<<<<<< HEAD
import com.mail.demo.dto.MailDTO;
import com.mail.demo.dto.MailType;
import com.mail.demo.response.ComposeResponse;
import com.mail.demo.response.SentboxResponse;
import com.mail.demo.response.Validator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
>>>>>>> 30836453590bb58632fb7071e90ae2c0c6a32087
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller; 
import com.mail.demo.service.*;
import org.springframework.beans.factory.annotation.Value;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.mail.*;
<<<<<<< HEAD
import org.springframework.web.servlet.view.RedirectView;

import java.util.*;
@Controller
@RequestMapping("/mail")
=======
import java.util.*;
@Controller
>>>>>>> 30836453590bb58632fb7071e90ae2c0c6a32087
public class HomeController {


     @Autowired
<<<<<<< HEAD
     private EmailSenderService mailSenderService;

     @Autowired
     private APIService apiService;

     @Autowired
     private MailService mailService;

     private Logger logger = LoggerFactory.getLogger(HomeController.class);
    @GetMapping("/")
=======
      private EmailSenderService mailSenderService;
  
    @RequestMapping("/")
>>>>>>> 30836453590bb58632fb7071e90ae2c0c6a32087
    public String home() {
         return "home";
    }

<<<<<<< HEAD
    @GetMapping("/inbox")
    public String inbox(Model model) {
        model.addAttribute("type","Inbox");
        model.addAttribute("result", mailService.findByType(MailType.Inbox.name()));
        model.addAttribute("content", new SentboxResponse());
        return "inbox";
    }

    @GetMapping("/outbox")
    public String outbox(Model model) {
        model.addAttribute("type","Outbox");
        model.addAttribute("result", mailService.findByType(MailType.Outbox.name()));
        model.addAttribute("content", new SentboxResponse());
        return "inbox";
    }

     @GetMapping("/compose")
     public String compose(Model model) {
        model.addAttribute("content", new ComposeResponse());
        return "compose";
     }

     @GetMapping("/sent")
     public String sentBox(Model model) {
        model.addAttribute("type", "SentBox");
        model.addAttribute("result", mailService.findByType(MailType.Sentbox.name()));
        model.addAttribute("content", new SentboxResponse());
         System.out.println("hey");
        return "inbox";
     }



     @RequestMapping("/read")
     public String readMessage(String id, Model model) {
         System.out.println(id);
        if(!Objects.isNull(id))
            model.addAttribute("content", mailService.findByID(Long.parseLong(id)));
        return "message";
     }

     @PostMapping("/compose/add")
    public RedirectView saveCompose(@ModelAttribute ComposeResponse content, MultipartFile multipartFile) {
        Validator toValidator = apiService.getEmailValidation(content.getToEmail());
        Validator fromValidator = apiService.getEmailValidation(content.getFromEmail());

         System.out.println(content);
         System.out.println(toValidator);
         System.out.println(fromValidator);
        if(!Objects.isNull(toValidator) && !Objects.isNull(fromValidator)) {
            if(toValidator.isValid() && fromValidator.isValid()) {
                if(!(toValidator.isDisposable() && fromValidator.isDisposable())) {
                    if (!(toValidator.isBlock() && fromValidator.isBlock())) {
                        mailService.saveMail(content,multipartFile);
                        logger.info("mail saved successfully");
                    }
                }
            }
        }
        return new RedirectView("/mail/sent");
     }

     @GetMapping("/test")
     @ResponseBody
    public Validator testAPI() {
        return apiService.getEmailValidation("fakorodehenry@gmail.com");
     }
=======
    @RequestMapping("/inbox")
    public String inbox() {
         return "inbox";
    }

     @RequestMapping("/compose")
     public String compose() {
        return "compose";
     }

>>>>>>> 30836453590bb58632fb7071e90ae2c0c6a32087
}