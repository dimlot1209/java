package com.btl.pojo;

import com.btl.pojo.Category;
import com.btl.pojo.Comment;
import com.btl.pojo.ProductShop;
import com.btl.pojo.ReceiptDetail;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-09-08T19:15:38")
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile SingularAttribute<Product, String> image;
    public static volatile SetAttribute<Product, Comment> commentSet;
    public static volatile SingularAttribute<Product, Long> price;
    public static volatile SetAttribute<Product, ProductShop> productShopSet;
    public static volatile SingularAttribute<Product, String> name;
    public static volatile SingularAttribute<Product, Boolean> active;
    public static volatile SingularAttribute<Product, String> description;
    public static volatile SingularAttribute<Product, Integer> id;
    public static volatile SetAttribute<Product, ReceiptDetail> receiptDetailSet;
    public static volatile SingularAttribute<Product, Category> categoryId;

}