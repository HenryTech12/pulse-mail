package com.mail.demo.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.time.*;
public @Data class MailDTO {

	private String fromEmail;
	private String toEmail;
	private String subject;
	private String body;
	private String status;
	private LocalDate sentOn;
	private LocalTime sentWhen;
	private String attachment;

}
