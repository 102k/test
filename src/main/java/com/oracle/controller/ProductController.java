package com.oracle.controller;

import cn.itcast.common.page.Pagination;
import com.oracle.common.Common;
import com.oracle.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("/getProducts")
    public String getProduct(String pname, Integer pageNo, Model model) throws Exception {
        Pagination product = productService.getProduct(pname, pageNo, Common.PAGE_SIZE);

       /* List<?> list = product.getList();
        System.out.println(list);

        int pageSize = product.getPageSize();
        System.out.println("pageSize="+pageSize);

        int pageNo1 = product.getPageNo();
        System.out.println("pageNo1="+pageNo1);
*/
        model.addAttribute("product",product);
        model.addAttribute("mainPage","list.jsp");
        return "dashboard";
    }
}
