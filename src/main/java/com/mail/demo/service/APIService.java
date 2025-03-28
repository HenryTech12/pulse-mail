package com.mail.demo.service;

import com.mail.demo.response.*;
import java.net.http.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import java.net.*;
import java.net.http.*;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class APIService
{
   @Value("${validator-url}")
	private String url;
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
	
}