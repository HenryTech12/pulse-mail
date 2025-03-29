package com.mail.demo.configuration;



@Configuration
public class AppConfig {


         @Bean
         public ModelMapper getModelMapper() {
              return new ModelMapper();
          }
}