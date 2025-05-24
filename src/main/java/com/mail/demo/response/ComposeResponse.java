package com.mail.demo.response;

import lombok.Data;

@Data
public class ComposeResponse {

    private String fromEmail;
    private String toEmail;
    private String subject;
    private String body;
}
