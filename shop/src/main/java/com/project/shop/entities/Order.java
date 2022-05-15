package com.project.shop.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity(name = "order")
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ordernumber;
    private LocalDate orderdate;
    private LocalDate requireddate;
    private LocalDate shippeddate;
    private String status;
    private String comments;

    @ManyToOne
    @JoinColumn(name = "customernumber")
    private Customer customer;

    public Long getOrdernumber() { return ordernumber; }
    public void setOrdernumber(Long ordernumber) { this.ordernumber = ordernumber; }

    public LocalDate getOrderdate() { return orderdate; }
    public void setOrderdate(LocalDate orderdate) { this.orderdate = orderdate; }

    public LocalDate getRequireddate() { return requireddate; }
    public void setRequireddate(LocalDate requireddate) { this.requireddate = requireddate; }

    public LocalDate getShippeddate() { return shippeddate; }
    public void setShippeddate(LocalDate shippeddate) { this.shippeddate = shippeddate; }
    
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getComments() { return comments; }
    public void setComments(String comments) { this.comments = comments; }

    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }
}
