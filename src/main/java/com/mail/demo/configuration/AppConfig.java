package com.mail.demo.configuration;

<<<<<<< HEAD
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
=======

>>>>>>> 30836453590bb58632fb7071e90ae2c0c6a32087

@Configuration
public class AppConfig {

<<<<<<< HEAD
    @Bean
    public ModelMapper getModelMapper() {
              return new ModelMapper();
          }

    @Bean
    public RestTemplate getRestTemplate() {return new RestTemplate();}
=======

         @Bean
         public ModelMapper getModelMapper() {
              return new ModelMapper();
          }
>>>>>>> 30836453590bb58632fb7071e90ae2c0c6a32087
}