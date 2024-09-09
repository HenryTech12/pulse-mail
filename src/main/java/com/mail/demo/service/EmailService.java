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
public class EmailService {

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

      public  List<Message> configureInbox() {
           List<Message> list = new ArrayList<>();
           Properties properties = new Properties();
           properties.put("mail.store.protocol", "imaps");
           properties.put("mail.imap.host", "imap.gmail.com");
           properties.put("mail.imap.port", "993");
           properties.put("mail.imap.ssl.enable", "true");
          
          try {
             Session session = Session.getInstance(properties);
             Store store = session.getStore("imaps");
             store.connect("imap.gmail.com",from,password);
             Folder folder = store.getFolder("INBOX");

                 while(!folder.isOpen()) {
			            folder.open(Folder.READ_ONLY);
                     Message[] messages = folder.search(new FlagTerm(new Flags(Flags.Flag.SEEN), false));
                     for(Message message:  messages)  {
                             System.out.println(message.getSubject());
                              list.add(message);
                             if(message == null) {
                                break;
                              }    
                         }
                     }
                         
             }   catch(Exception e) { e.printStackTrace(); }
               return list;
			 }
         
}