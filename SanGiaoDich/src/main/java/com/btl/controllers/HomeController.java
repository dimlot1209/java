/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btl.controllers;

import com.btl.service.CategoryService;
import com.btl.service.ProductService;
import java.util.Map;
import javax.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Lọt
 */
@Controller
@ControllerAdvice
public class HomeController {

    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ProductService productService;

    @RequestMapping("/")
    public String index(Model model,
            @RequestParam(required = false) Map<String, String> param) {
        int page = Integer.parseInt(param.getOrDefault("page", "1"));
        model.addAttribute("categories", this.categoryService.getCategory());
        model.addAttribute("products", this.productService.getProducts(param.get("kw"), page));
        model.addAttribute("counter", this.productService.countProduct());

        return "index";
    }
    
    @ModelAttribute
    public void commonAttr(Model model){
        model.addAttribute("categories", this.categoryService.getCategory());
    }

//    @RequestMapping(path = "/hello/{name}")
//    public String hello(Model model,
//            @PathVariable(value = "name") String name) {
//        model.addAttribute("message", "Welcome " + name + " !!!");
//
//        return "hello";
//    }
//
//    @RequestMapping(path = "/test")
//    public String testRedirect(Model model) {
//        model.addAttribute("testMsg", "WELCOME TO CON 2 NGAY DE CHAY DEADLINE");
//
//        return "forward:/hello/Loc";
//    }
}
