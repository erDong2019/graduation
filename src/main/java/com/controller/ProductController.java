package com.controller;

import com.model.Product;
import com.service.IProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2019/3/4.
 */
@Controller
@RequestMapping("/product")
public class ProductController {
    @Resource
    private IProductService service;

    @RequestMapping("/list")
    public String select(Model model) {
        List<Product> list = service.selectTotal();
        model.addAttribute("proList", list);
        return "main";
    }
}
