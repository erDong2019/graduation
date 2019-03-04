package com.mapper;

import com.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2019/3/4.
 */
@Repository
public interface ProductMapper {

    List<Product> selectTotal();
}
