package com.oracle.serviceImpl;

import cn.itcast.common.page.Pagination;
import com.oracle.mapper.ProductMapper;
import com.oracle.pojo.Product;
import com.oracle.pojo.ProductExample;
import com.oracle.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductMapper productMapper;

    @Override
    public Pagination getProduct(String pname, Integer pageNo, Integer pageSize) throws Exception {
        StringBuilder stringBuilder = new StringBuilder();
        ProductExample productExample = new ProductExample();
        ProductExample.Criteria criteria = productExample.createCriteria();
        if(pname != null && "".equals(pname)){
            criteria.andPnameLike("%" + pname + "%");
            stringBuilder.append("pname="+pname);
        }

        productExample.setOrderByClause("pid desc");
        productExample.setPageSize(pageSize);
        pageNo = Pagination.cpn(pageNo);
        productExample.setPageNo(pageNo);
        List<Product> products = productMapper.selectByExample(productExample);
        int totalCount = productMapper.countByExample(productExample);


        Pagination pagination = new Pagination(pageNo,pageSize,totalCount,products);

        String url = "getProducts";
        pagination.pageView(url,new String(stringBuilder));
        return pagination;
    }
}
