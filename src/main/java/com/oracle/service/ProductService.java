package com.oracle.service;

import cn.itcast.common.page.Pagination;

public interface ProductService {
    public Pagination getProduct(String pname,Integer pageNo,Integer pageSize) throws Exception;
}
