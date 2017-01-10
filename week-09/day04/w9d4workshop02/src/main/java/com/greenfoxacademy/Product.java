package com.greenfoxacademy;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by ${SzilviaB} on 2017. 01. 08..
 */
@Entity
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    private String name;
    private Integer price;

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, name='%s', price=%d]", id, name, price);
    }

    public Product(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    protected Product() {
    }
}