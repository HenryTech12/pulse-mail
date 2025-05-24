package com.mail.demo.model;

<<<<<<< HEAD
import jakarta.persistence.*;
import lombok.Data;

@Entity
public @Data class UserModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String email;
	private String username;
	private String password;
	@Lob
	private String profileImage;
        
}
=======

public class UserModel {

        private Long id;
        private String email;
        private String username;
        private String password;
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

	public void setFileModel(FileModel fileModel)
	{
		this.fileModel = fileModel;
	}

	public FileModel getFileModel()
	{
		return fileModel;
	}}
>>>>>>> 30836453590bb58632fb7071e90ae2c0c6a32087
