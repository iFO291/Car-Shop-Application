package com.project.shop.entities;

import javax.persistence.*;

@Entity(name = "productline")
@Table(name = "productlines")
public class ProductLine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String productline;
    public String textdescription;
    public String htmldescription;
    public String image;

    public String getProductline() { return productline; }
    public void setProductline(String productline) { this.productline = productline; }

    public String getTextdescription() { return textdescription; }
    public void setTextdescription(String textdescription) { this.textdescription = textdescription; }

    public String getHtmldescription() { return htmldescription; }
    public void setHtmldescription(String htmldescription) { this.htmldescription = htmldescription; }

    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }
}
