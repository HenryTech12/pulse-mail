package com.mail.demo.pagination;


<<<<<<< HEAD
import lombok.Data;

public @Data class Sorting {
	private String sortBy;
	private int pageNo;
	private int pageSize;
}
=======
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
>>>>>>> 30836453590bb58632fb7071e90ae2c0c6a32087
