package com.greenfox.reddit.services;

import com.greenfox.reddit.models.Post;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ${SzilviaB} on 2017. 01. 04..
 */
public interface PostRepository extends CrudRepository<Post,Long> {

}
