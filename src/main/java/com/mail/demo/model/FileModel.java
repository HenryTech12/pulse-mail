package com.mail.demo.model;


public class FileModel {

      private Long id;
	   @Lob
       private byte[] profileImage;
	   @Lob
       private byte[] attachment;


   public void setId(Long id)
	{
		this.id = id;
	}

	public Long getId()
	{
		return id;
	}
	public void setProfileImage(byte[] profileImage)
	{
		this.profileImage = profileImage;
	}

	public byte[] getProfileImage()
	{
		return profileImage;
	}

	public void setAttachment(byte[] attachment)
	{
		this.attachment = attachment;
	}

	public byte[] getAttachment()
	{
		return attachment;
	}}
