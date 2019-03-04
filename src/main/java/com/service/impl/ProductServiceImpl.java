package com.service.impl;

import com.mapper.ProductMapper;
import com.model.Product;
import com.service.IProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2019/3/4.
 */
@Service("service")
public class ProductServiceImpl implements IProductService {
    @Resource
    private ProductMapper productMapper;

    @Override
    public List<Product> selectTotal() {
        return productMapper.selectTotal();
    }
}
