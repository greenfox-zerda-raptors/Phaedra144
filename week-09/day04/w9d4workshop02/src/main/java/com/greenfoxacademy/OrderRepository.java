package com.greenfoxacademy;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by ${SzilviaB} on 2017. 01. 08..
 */
public interface OrderRepository extends CrudRepository<Order, Long> {


    List<Order> findByName(String name);
}
