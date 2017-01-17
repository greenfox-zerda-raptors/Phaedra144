package com.greenfox.szilvi.calorie.repositories;

import com.greenfox.szilvi.calorie.models.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ${SzilviaB} on 2017. 01. 13..
 */
public interface UserRepository extends CrudRepository<User, String> {

    User findOne(String username);
}
