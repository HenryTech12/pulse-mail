package com.mail.demo.dto;


public class UserDTO {

        private String email;
        private String username;
        private String password;
        private FileDTO fileDTO;


	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getEmail()
	{
		return email;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getUsername()
	{
		return username;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getPassword()
	{
		return password;
	}

	public void setFileDTO(FileDTO fileDTO)
	{
		this.fileDTO = fileDTO;
	}

	public FileDTO getFileDTO()
	{
		return fileDTO;
	}}
