package com.mail.demo.pagination;


import lombok.Data;

public @Data class Sorting {
	private String sortBy;
	private int pageNo;
	private int pageSize;
}
