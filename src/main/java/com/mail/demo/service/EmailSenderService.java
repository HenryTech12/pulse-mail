package com.mail.demo.service;

import org.springframework.mail.javamail.JavaMailSender;
import jakarta.mail.internet.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.mail.javamail.MimeMessageHelper;
import jakarta.mail.*;
import jakarta.mail.search.FlagTerm;
import java.util.*;

@Service
public class EmailSenderService {

      @Autowired
      private JavaMailSender mailSender;

       @Value("${spring.mail.username}")
       private String from;
       @Value("${spring.mail.password}")
       private String password;

      public void sendMail(String to, String subject, String message) {
         try {
             MimeMessage mime = mailSender.createMimeMessage();
             MimeMessageHelper mail = new MimeMessageHelper(mime,true);
             mail.setFrom(from);
             mail.setTo(to);
             mail.setSubject(subject);
             mail.setText(message);
            
             mailSender.send(mime);
         }
        catch(Exception e) { e.printStackTrace(); }
     }
}