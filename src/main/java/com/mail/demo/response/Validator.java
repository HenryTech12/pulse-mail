package com.mail.demo.response;

import java.time.*;
import java.util.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Validator
{
	private boolean valid;
	private boolean block;
	private boolean disposable;
	private boolean email_forwarder;
	private String domain;
	private String text;
	private String reason;
	private int risk;
	private String mx_host;
	List<String> possible_typo;
	private String mx_ip;
	private String mx_info;
	private String last_changed_at;
	
}
