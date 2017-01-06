package com.greenfox.reddit.services;

import com.greenfox.reddit.models.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;


/**
 * Created by ${SzilviaB} on 2017. 01. 04..
 */
public interface PostRepository extends PagingAndSortingRepository<Post,Long> {

   List<Post> findTop5ByOrderByScoreDesc();

}
