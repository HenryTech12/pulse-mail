package com.mail.demo.service;

import com.mail.demo.response.*;
<<<<<<< HEAD
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;
=======
import java.net.http.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import java.net.*;
import java.net.http.*;
import com.fasterxml.jackson.core.type.TypeReference;
>>>>>>> 30836453590bb58632fb7071e90ae2c0c6a32087

@Service
public class APIService
{
   @Value("${validator-url}")
	private String url;
<<<<<<< HEAD
   @Value("${validator-key}")
	private String apiKey;
	private Logger logger = LoggerFactory.getLogger(APIService.class);
	@Autowired
	private RestTemplate restTemplate;
	public APIService() {
	}

	public Validator getEmailValidation(String email) {

		Validator validator = null;
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.set("x-rapid-host","mailcheck.p.rapidapi.com");
		httpHeaders.set("x-rapidapi-key",apiKey);

		HttpEntity<?> httpEntity = new HttpEntity<>(httpHeaders);
		if(!Objects.isNull(email)) {
			validator = restTemplate.exchange(url.concat(email),
					HttpMethod.GET,httpEntity, Validator.class).getBody();
			logger.info("api result: {}",validator);
		}
		return validator;
	}

=======
	private HttpClient httpClient;
   @Value("${validator-key}")
	private String apiKey;
	private ObjectMapper objectMapper;

	public EmailValidatorService() {
	    httpClient = HttpClient.newHttpClient();
		objectMapper = new ObjectMapper();
	}

	public Validator getEmailValidation(String email) {
     try {
		HttpRequest request =  HttpRequest.newBuilder().uri(new URI(url.concat(email)))
			.header("x-rapid-host", "mailcheck.p.rapidapi.com")
			.header("x-rapidapi-key",apiKey)
			.GET()
			.build();
		HttpResponse<String> response = httpClient.send(request,HttpResponse.BodyHandlers.ofString());
		Validator validator = objectMapper.readValue(response.toString() , new TypeReference<Validator>(){});
		return validator;
	 }
     catch(Exception e) { e.printStackTrace(); }
     return new Validator();
	}
	
>>>>>>> 30836453590bb58632fb7071e90ae2c0c6a32087
}