package com.mail.demo.model;


public class FileDTO {

       private byte[] profileImage;
       private byte[] attachment;



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
