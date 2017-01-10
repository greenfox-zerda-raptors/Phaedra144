package com.greenfox.reddit.services;

import com.greenfox.reddit.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import java.util.List;


/**
 * Created by ${SzilviaB} on 2017. 01. 05..
 */
@Component
public class PostService {

    PostRepository repository;

    @Autowired
    public PostService(PostRepository repository) {
        this.repository = repository;
    }

    public void savePost(Post post){
        repository.save(post);
    }

    public void addPost(Model model){
        model.addAttribute("addedPost", new Post());
    }

    public Page<Post> findPosts(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public List<Post> findFirst5(){
        return repository.findTop5ByOrderByScoreDesc();
    }

    public void upvoting(long id){
        Post post = repository.findOne(id);
        post.increment();
        repository.save(post);
    }

    public void downvoting(long id){
        Post post = repository.findOne(id);
        post.decrement();
        repository.save(post);
    }


}
