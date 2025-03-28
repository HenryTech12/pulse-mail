package com.mail.demo.model;


public class MailModel {

         private Long id;
         private String from;
         private String to;
         private String subject;
         private String message;
         private String status;
         private LocalDate sentOn;
         private LocalTime sentWhen;
         private byte[] attachment;
}