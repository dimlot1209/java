package com.btl.pojo;

import com.btl.pojo.Product;
import com.btl.pojo.Receipt;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-09-08T19:15:38")
@StaticMetamodel(ReceiptDetail.class)
public class ReceiptDetail_ { 

    public static volatile SingularAttribute<ReceiptDetail, Long> unitPrice;
    public static volatile SingularAttribute<ReceiptDetail, Product> productId;
    public static volatile SingularAttribute<ReceiptDetail, String> num;
    public static volatile SingularAttribute<ReceiptDetail, Integer> id;
    public static volatile SingularAttribute<ReceiptDetail, Receipt> receiptId;

}