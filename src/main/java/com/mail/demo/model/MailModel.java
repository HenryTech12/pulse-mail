package com.mail.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.*;

@Entity
public @Data class MailModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String fromEmail;
	private String toEmail;
	private String subject;
	private String body;
	private String status;
	private LocalDate sentOn;
	private LocalTime sentWhen;
	@Lob
	private String attachment;
	private String type;
	private String filename;

}
