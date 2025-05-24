package com.mail.demo.pagination;


public class PageRequestSorter {

  
         private String sortBy = "name"; //default
         private Sort.Direction sortDir = Sort.Direction.ASC; //default
         private int pageNo;
		   private int pageSize;
		   

       public Pageable getPageable(Sorting sort) {
			   if(!Objects.isNull(sorting))  {
                  String getSortBy =  (!Objects.isNull(sort.getType())) ? sort.getType() : sortBy;
                  int newpageNo = (sort.getPageNo() > this.pageNo) ? sort.getPageNo() : this.pageNo;
				  int newpageSize = (sort.getPageSize() > this.pageSize) ? sort.getPageSize() : this.pageSize;
				  
				  Pageable pageable = PageRequest.of(newpageNo, newpageSize, sortDir, getSortBy);
				  
                  return pageable;
				}
                else {
				  return PageRequest.of(this.pageNo, this.pageSize, sortDir, this.sortBy);
				}
      }
 }
