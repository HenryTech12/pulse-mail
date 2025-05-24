package com.mail.demo.dto;

<<<<<<< HEAD
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
=======
import java.time.*;
public class MailDTO {

         private String from;
         private String to;
         private String subject;
         private String body;
         private String status;
         private LocalDate sentOn;
         private LocalTime sentWhen;
         private FileDTO fileDTO;


	public void setFrom(String from)
	{
		this.from = from;
	}

	public String getFrom()
	{
		return from;
	}

	public void setTo(String to)
	{
		this.to = to;
	}

	public String getTo()
	{
		return to;
	}

	public void setSubject(String subject)
	{
		this.subject = subject;
	}

	public String getSubject()
	{
		return subject;
	}

	public void setBody(String body)
	{
		this.body = body;
	}

	public String getBody()
	{
		return body;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public String getStatus()
	{
		return status;
	}

	public void setSentOn(LocalDate sentOn)
	{
		this.sentOn = sentOn;
	}

	public LocalDate getSentOn()
	{
		return sentOn;
	}

	public void setSentWhen(LocalTime sentWhen)
	{
		this.sentWhen = sentWhen;
	}

	public LocalTime getSentWhen()
	{
		return sentWhen;
	}

	public void setFileDTO(FileDTO fileDTO)
	{
		this.fileDTO = fileDTO;
	}

	public FileDTO getFileDTO()
	{
		return fileDTO;
	}}
>>>>>>> 30836453590bb58632fb7071e90ae2c0c6a32087
