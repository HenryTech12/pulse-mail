package com.mail.demo.model;


public class UserModel {

        private Long id;
        private String email;
        private String username;
        private String password;
        @Lob
        private byte[] profileImage;
        
}