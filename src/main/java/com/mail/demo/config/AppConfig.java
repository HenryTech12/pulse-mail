package com.mail.demo.config;



@Configuration
public class AppConfig {


         @Bean
         public ModelMapper getModelMapper() {
              return new ModelMapper();
          }
}