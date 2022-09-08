package com.btl.pojo;

import com.btl.pojo.Product;
import com.btl.pojo.Shop;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-09-08T19:15:38")
@StaticMetamodel(ProductShop.class)
public class ProductShop_ { 

    public static volatile SingularAttribute<ProductShop, Product> productId;
    public static volatile SingularAttribute<ProductShop, Integer> id;
    public static volatile SingularAttribute<ProductShop, Shop> shopId;

}