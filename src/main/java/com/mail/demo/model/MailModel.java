package com.mail.demo.model;

import java.time.*;
public class MailModel {

         private Long id;
         private String from;
         private String to;
         private String subject;
         private String message;
         private String status;
         private LocalDate sentOn;
         private LocalTime sentWhen;
         @OneToOne
         private FileModel fileModel;




	public void setId(Long id)
	{
		this.id = id;
	}

	public Long getId()
	{
		return id;
	}

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

	public void setMessage(String message)
	{
		this.message = message;
	}

	public String getMessage()
	{
		return message;
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

	public void setFileModel(FileModel fileModel)
	{
		this.fileModel = fileModel;
	}

	public FileModel getFileModel()
	{
		return fileModel;
	}
	
	}
