package com.mail.demo.model;

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
