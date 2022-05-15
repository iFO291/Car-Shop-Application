package com.project.shop.entities;

import javax.persistence.*;

@Entity(name = "orderdetail")
@Table(name = "orderdetails")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ordernumber;
    private String product;
    private int quantityordered;
    private float priceeach;
    private int orderlinenumber;
    
    public Long getOrdernumber() { return ordernumber; }
    public void setOrdernumber(Long ordernumber) { this.ordernumber = ordernumber; }

    public String getProduct() { return product; }
    public void setProduct(String product) { this.product = product; }

    public int getQuantityordered() { return quantityordered; }
    public void setQuantityordered(int quantityordered) { this.quantityordered = quantityordered; }

    public float getPriceeach() { return priceeach; }
    public void setPriceeach(float priceeach) { this.priceeach = priceeach; }

    public int getOrderlinenumber() { return orderlinenumber; }
    public void setOrderlinenumber(int orderlinenumber) { this.orderlinenumber = orderlinenumber; }
}
