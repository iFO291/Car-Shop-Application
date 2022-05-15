package com.project.shop.entities;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity(name = "customer")
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customernumber", updatable = false, nullable = false)
    private Long customernumber;
    private String customername;
    
    @NotEmpty(message = "You have to add a last name")
    private String contactlastname;
    
    @NotEmpty(message = "You have to add a first name")
    private String contactfirstname;
    private String phone;

    @NotEmpty(message = "You need to fill in your address")
    private String addressline1;
    private String addressline2;
    private String city;
    private String state;

    @NotEmpty(message = "You need to fill in your postal code")
    private String postalcode;
    private String country;
    private int salesrepemployeenumber;
    private float creditlimit;

    public Long getCustomernumber() { return customernumber; }
    public void setCustomernumber(Long customernumber) { this.customernumber = customernumber; }

    public String getCustomername() { return customername; }
    public void setCustomername(String customername) { this.customername = customername; }

    public String getContactlastname() { return contactlastname; }
    public void setContactlastname(String contactlastname) { this.contactlastname = contactlastname; }

    public String getContactfirstname() { return contactfirstname; }
    public void setContactfirstname(String contactfirstname) { this.contactfirstname = contactfirstname; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getAddressline1() { return addressline1; }
    public void setAddressline1(String addressline1) { this.addressline1 = addressline1; }

    public String getAddressline2() { return addressline2; }
    public void setAddressline2(String addressline2) { this.addressline2 = addressline2; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }

    public String getPostalcode() { return postalcode; }
    public void setPostalcode(String postalcode) { this.postalcode = postalcode; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public int getSalesrepemployeenumber() { return salesrepemployeenumber; }
    public void setSalesemployeenumber(int salesrepemployeenumber) { this.salesrepemployeenumber = salesrepemployeenumber; }

    public float getCreditlimit() { return creditlimit; }
    public void setCreditlimit(float creditlimit) { this.creditlimit = creditlimit; }
}
