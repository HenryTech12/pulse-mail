package com.mail.demo.pagination;


public class Sorting {

         private String sortBy;
         private int pageNo;
		 private int pageSize;




	public void setSortBy(String sortBy)
	{
		this.sortBy = sortBy;
	}

	public String getSortBy()
	{
		return sortBy;
	}

	public void setPageNo(int pageNo)
	{
		this.pageNo = pageNo;
	}

	public int getPageNo()
	{
		return pageNo;
	}

	public void setPageSize(int pageSize)
	{
		this.pageSize = pageSize;
	}

	public int getPageSize()
	{
		return pageSize;
	}}
