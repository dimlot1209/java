package com.btl.pojo;

import com.btl.pojo.ReceiptDetail;
import com.btl.pojo.Shop;
import com.btl.pojo.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-09-08T19:15:38")
@StaticMetamodel(Receipt.class)
public class Receipt_ { 

    public static volatile SingularAttribute<Receipt, Long> amount;
    public static volatile SingularAttribute<Receipt, Integer> id;
    public static volatile SingularAttribute<Receipt, Shop> shopId;
    public static volatile SetAttribute<Receipt, ReceiptDetail> receiptDetailSet;
    public static volatile SingularAttribute<Receipt, User> userId;
    public static volatile SingularAttribute<Receipt, Date> createDate;

}