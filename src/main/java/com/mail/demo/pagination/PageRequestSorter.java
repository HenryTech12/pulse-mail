package com.mail.demo.pagination;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class PageRequestSorter {

    private String sortBy = "name"; //default
    private Sort.Direction sortDir = Sort.Direction.ASC; //default
    private int pageNo = 5;
    private int pageSize = 10;

    public Pageable getPageable(Sorting sort) {
        Pageable pageable = PageRequest.of(pageNo, pageSize, sortDir, sortBy);
        return pageable;
    }
}
