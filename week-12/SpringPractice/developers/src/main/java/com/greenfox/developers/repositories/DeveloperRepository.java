package com.greenfox.developers.repositories;

import com.greenfox.developers.models.Developer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ${SzilviaB} on 2017. 01. 22..
 */
public interface DeveloperRepository extends CrudRepository<Developer, Long> {
}
