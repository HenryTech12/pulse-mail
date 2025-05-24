package com.mail.demo.service;

<<<<<<< HEAD
import com.mail.demo.dto.MailDTO;
import com.mail.demo.dto.MailType;
import com.mail.demo.dto.Status;
import com.mail.demo.model.MailModel;
import com.mail.demo.response.ComposeResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
=======
>>>>>>> 30836453590bb58632fb7071e90ae2c0c6a32087
import org.springframework.mail.javamail.JavaMailSender;
import jakarta.mail.internet.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.mail.javamail.MimeMessageHelper;
import jakarta.mail.*;
import jakarta.mail.search.FlagTerm;
<<<<<<< HEAD
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
=======
>>>>>>> 30836453590bb58632fb7071e90ae2c0c6a32087
import java.util.*;

@Service
public class EmailSenderService {

      @Autowired
      private JavaMailSender mailSender;

       @Value("${spring.mail.username}")
       private String from;
       @Value("${spring.mail.password}")
       private String password;
<<<<<<< HEAD
       @Value("${mail.imap.host}")
       private String host;
       @Value("${mail.imap.port}")
       private String port;
       private Logger logger = LoggerFactory.getLogger(EmailSenderService.class);

      public void sendMail(MailModel mailModel, ComposeResponse composeResponse, MultipartFile multipartFile) {
         try {
             MimeMessage mime = mailSender.createMimeMessage();
             MimeMessageHelper mail = new MimeMessageHelper(mime, true);
             mail.setFrom(composeResponse.getFromEmail());
             mail.setTo(composeResponse.getToEmail());
             mail.setSubject(composeResponse.getSubject());
             mail.setText(composeResponse.getBody());
             if (!Objects.isNull(multipartFile)) {
                 mail.addAttachment(Objects.requireNonNull(multipartFile.getOriginalFilename()),
                         new File(Arrays.toString(multipartFile.getBytes())));
                 mailModel.setAttachment(Arrays.toString(multipartFile.getBytes()));
                 mailModel.setFilename(multipartFile.getOriginalFilename());
             }

             mailModel.setStatus(Status.MAIL_PENDING.name());
             mailSender.send(mime);
             mailModel.setStatus(Status.MAIL_SUCCESS.name());
             mailModel.setSentOn(LocalDate.now());
             mailModel.setSentWhen(LocalTime.now());

         }
        catch(MessagingException e) {
             mailModel.setStatus(Status.MAIL_FAILURE.name());
             mailModel.setType(MailType.Outbox.name());
             logger.error("ERROR: {}", e.getMessage());
          } catch (IOException e) {
             throw new RuntimeException(e);
         }
      }
/*
      public void readIncomingMails() {
          //System.out.println("testing inbox...");
          try {
              Properties props = new Properties();
              props.put("mail.store.protocol", "imaps");
              props.put("mail.imaps.host", host);
              props.put("mail.imaps.port", port);

              Session session = Session.getInstance(props);
              Store store = session.getStore("imaps");
              store.connect(host, from, password);

              Folder inbox = store.getFolder("INBOX");
              inbox.open(Folder.READ_ONLY); // READ_WRITE so we can mark as read

              Message message = (Message) Arrays.stream(inbox.getMessages())
                      .filter((data) -> {
                          Date date = new Date(2025,5,16);
                          try {
                              return (data.getReceivedDate().after(date));
                          } catch (MessagingException e) {
                              throw new RuntimeException(e);
                          }
                      });
              System.out.println(message.getFrom());
              if (message instanceof MimeMessage) {
                  MimeMessage mimeMessage = (MimeMessage) message;

                  System.out.println("Subject: " + mimeMessage.getSubject());
                  System.out.println("From: " + mimeMessage.getFrom()[0]);
                  System.out.println("Sent Date: " + mimeMessage.getSentDate());
                  //System.out.println("Body: " + extractText(mimeMessage));

                  // Mark message as read
                  //message.setFlag(Flags.Flag.SEEN, true);

             }
          } catch (NoSuchProviderException ex) {
              throw new RuntimeException(ex);
          } catch (MessagingException ex) {
              throw new RuntimeException(ex);
          }

          //inbox.close(false);
          ///store.close();
      }*/
=======

      public void sendMail(MailDTO mailDto) {
         try {
             MimeMessage mime = mailSender.createMimeMessage();
             MimeMessageHelper mail = new MimeMessageHelper(mime,true);
             mail.setFrom(mailDto.getFrom());
             mail.setTo(mailDto.getTo());
             mail.setSubject(mailDto.getSubject());
             mail.setText(mailDto.getBody());
            
             mailDto.setStatus(Status.MAIL_PENDING);
             mailSender.send(mime);
             mailDto.setStatus(Status.MAIL_SUCCESS);
         }
        catch(Exception e) {
             mailDto.setStatus(Status.MAIL_FAILURE);
            e.printStackTrace(); 
          }
     }
>>>>>>> 30836453590bb58632fb7071e90ae2c0c6a32087
}