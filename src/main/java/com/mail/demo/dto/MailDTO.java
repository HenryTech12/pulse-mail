package com.mail.demo.dto;


public class MailDTO {

         private String from;
         private String to;
         private String subject;
         private String body;
         private String status;
         private LocalDate sentOn;
         private LocalTime sentWhen;
         private byte[] attachment;
}