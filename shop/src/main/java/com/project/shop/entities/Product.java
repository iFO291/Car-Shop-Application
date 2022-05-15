package com.project.shop.entities;

import javax.persistence.*;

@Entity(name = "product")
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productcode", updatable = false, nullable = false)
    private String productcode;
    private String productname;
    private String productline;
    private String productscale;
    private String productvendor;
    private String productdescription;
    private int quantityinstock;
    private float buyprice;
    private float msrp;

    @Transient
    private int quantityincart;
    
    /** GETTERS & SETTERS */
    public int getQuantityincart() { return quantityincart; }
    public void setQuantityincart(int quantityincart) { this.quantityincart = quantityincart; }

    public String getProductcode() { return productcode; }
    public void setProductcode(String productcode) { this.productcode = productcode; }

    public String getProductname() { return productname; }
    public void setProductname(String productname) { this.productname = productname; }

    public String getProductline() { return productline; }
    public void setProductline(String productline) { this.productline = productline; }

    public String getProductscale() { return productscale; }
    public void setProductscale(String productscale) { this.productscale = productscale; }

    public String getProductvendor() { return productvendor; }
    public void setProductvendor(String productvendor) { this.productvendor = productvendor; }

    public String getProductdescription() { return productdescription; }
    public void setProductdescription(String productdescription) { this.productdescription = productdescription; }

    public int getQuantityinstock() { return quantityinstock; }
    public void setQuantityinstock(int quantityinstock) { this.quantityinstock = quantityinstock; }

    public float getBuyprice() { return buyprice; }
    public void setBuyprice(float buyprice) { this.buyprice = buyprice; }

    public float getMsrp() { return msrp; }
    public void setMsrp(float msrp) { this.msrp = msrp; }

    /** CONSTRUCTORS */
    public Product() {}
    
    public Product(String productcode, String productname, float msrp) {
        this.productcode = productcode;
        this.productname = productname;
        this.msrp = msrp;
    }

    public Product(String productcode, String productname, String productline, String productscale, String productvendor, String productdescription, int quantityinstock, float buyprice, float msrp) {
        this.productcode = productcode;
        this.productname = productname;
        this.productline = productline;
        this.productscale = productscale;
        this.productvendor = productvendor;
        this.productdescription = productdescription;
        this.quantityinstock = quantityinstock;
        this.buyprice = buyprice;
        this.msrp = msrp;
    }
}
