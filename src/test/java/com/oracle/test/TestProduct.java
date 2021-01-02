package com.oracle.test;

import cn.itcast.common.page.Pagination;
import com.oracle.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

@SpringJUnitConfig(locations = "classpath:config/bean.xml")
public class TestProduct {
    @Autowired
    ProductService productService;

    @Test
    public void getProduct() throws Exception {
        Pagination pagination = productService.getProduct("", 1, 2);
        List<?> list = pagination.getList();

        System.out.println(list);


    }
}
