/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.btl.repository;

import com.btl.pojo.Product;
import java.util.List;

/**
 *
 * @author Lọt
 */
public interface ProductRepository {
    List<Product> getProducts(String kw, int page);
    boolean addOrUpdate(Product product);
    long countProduct();
}
