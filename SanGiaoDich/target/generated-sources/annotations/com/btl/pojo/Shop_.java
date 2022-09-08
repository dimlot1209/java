package com.btl.pojo;

import com.btl.pojo.ProductShop;
import com.btl.pojo.Receipt;
import com.btl.pojo.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-09-08T19:15:38")
@StaticMetamodel(Shop.class)
public class Shop_ { 

    public static volatile SetAttribute<Shop, Receipt> receiptSet;
    public static volatile SetAttribute<Shop, ProductShop> productShopSet;
    public static volatile SingularAttribute<Shop, String> name;
    public static volatile SingularAttribute<Shop, Integer> id;
    public static volatile SingularAttribute<Shop, User> userId;

}