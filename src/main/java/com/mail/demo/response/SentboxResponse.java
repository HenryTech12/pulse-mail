package com.mail.demo.response;

import lombok.Data;

@Data
public class SentboxResponse {

    private String body;
    private String subject;
    private String sentWhen;
}
