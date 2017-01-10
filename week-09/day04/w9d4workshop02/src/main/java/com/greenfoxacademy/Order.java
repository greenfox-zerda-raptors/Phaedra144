package com.greenfoxacademy;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by ${SzilviaB} on 2017. 01. 08..
 */
@Entity
@Getter
@Setter
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    private String name;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "order")
    public List<Item> items;

    protected Order() {
    }

    public Order(String name, Customer customer, List<Item> items) {
        this.name = name;
        this.customer = customer;
        this.items = items;
        this.createdAt = new Date();
    }

    // reference to the customer table
}