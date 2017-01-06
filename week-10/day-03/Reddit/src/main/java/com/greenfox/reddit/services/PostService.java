package com.greenfox.reddit.services;

import com.greenfox.reddit.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;



/**
 * Created by ${SzilviaB} on 2017. 01. 05..
 */
@Component
public class PostService {
    int pageNumber = 0;
    PostRepository repository;

    @Autowired
    public PostService(PostRepository repository) {
        this.repository = repository;
    }

//    public Iterable<Post> findAll(){
//        return repository.findAll();
//    }

    public void savePost(Post post){
        repository.save(post);
    }

    public void addPost(Model model){
        model.addAttribute("addedPost", new Post());
    }

    public Page<Post> find10Posts(Pageable pageable) {
        return repository.findAll(pageable);
    }

//    public Page<Post> findPrevious10(){
//        return repository.findAll(new PageRequest(pageNumber--, 5, Sort.Direction.DESC, "score"));
//    }

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

    public void increasePageNumber(){
        pageNumber++;
    }


}
