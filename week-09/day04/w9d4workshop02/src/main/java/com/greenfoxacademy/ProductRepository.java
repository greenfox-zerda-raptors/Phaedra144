package com.greenfoxacademy;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by ${SzilviaB} on 2017. 01. 08..
 */
public interface ProductRepository extends CrudRepository<Product,Long> {

  List<Product>findByName(String name);
}
