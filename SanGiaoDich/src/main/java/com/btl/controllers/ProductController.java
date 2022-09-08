/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btl.controllers;

import com.btl.pojo.Product;
import com.btl.service.ProductService;
import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Lọt
 */
@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/add/products")
    public String list(Model model) {
        model.addAttribute("product", new Product());
        return "product";
    }

    @PostMapping("add/products")
    public String add(Model model, @ModelAttribute(value = "product") @Valid Product product,
            BindingResult result) {
        if(!result.hasErrors()){
            if(this.productService.addOrUpdate(product)==true)
                return "redirect:/";
            else
                model.addAttribute("errMsg", "Wrong !!!");
        }
//        if (!result.hasErrors()) {
//            return "product";
//        else{
//                try{
//                Map = this.c
//                }
//                    }
//        }
//            if (this.productService.addOrUpdate(product) == true)
//                    return "redirect:/";
//            else
//                model.addAttribute("errMsg", "Da co loi !");
//        }
//
        return "product";
    }

}
