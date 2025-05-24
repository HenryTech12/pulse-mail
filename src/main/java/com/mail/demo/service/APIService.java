package com.mail.demo.service;

import com.mail.demo.response.*;
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

@Service
public class APIService
{
   @Value("${validator-url}")
	private String url;
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

}