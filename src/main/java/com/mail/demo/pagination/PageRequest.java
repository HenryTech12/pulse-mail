package com.mail.demo.pagination;


public class PageRequest {

  
           private String sortBy = "name"; //default
           private Sort.Direction sortDir = Sort.Direction.ASC; //default
           

            public Pageable getPageable(String mySortBy , private String sortDir) {
                  String getSortBy =  (!Objects.isNull(mySortBy)) ? mySortBy : sortBy;
                  //String sortDir = 

                  return null;

            }
}