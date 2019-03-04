package com;

import com.service.IProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2019/3/4.
 */
@ContextConfiguration("classpath:application.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class ProductServiceTest {
    @Resource
    IProductService service;

    @Test
    public  void test(){
        System.out.println("qweqweqweqw");
    }
}
