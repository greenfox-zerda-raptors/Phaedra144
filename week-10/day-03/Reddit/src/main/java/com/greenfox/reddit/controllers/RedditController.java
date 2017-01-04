package com.greenfox.reddit.controllers;

import com.greenfox.reddit.models.Post;
import com.greenfox.reddit.services.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


/**
 * Created by ${SzilviaB} on 2017. 01. 04..
 */
@Controller
@RequestMapping("/posts")
public class RedditController {

    @Autowired
    PostRepository repository;

    @RequestMapping("/hello")
    public String greeting (){
        return "helloworld";
    }

    @RequestMapping(value = {"", "/"})
    public String list(Model model) {
        model.addAttribute("posts", repository.findAll());
        return "list_posts";
    }

    @GetMapping("/add")
    public String addPost (Model model) {
        model.addAttribute("addedPost", new Post());
        return "add_post";
    }

    @PostMapping("/add")
    public String createPost(@ModelAttribute Post post) {
        repository.save(post);
        return "redirect:/posts/";
    }

    @RequestMapping(value = "/{id}/upvote", method = RequestMethod.GET)
    public String incrementScore(@PathVariable long id) {
        Post post = repository.findOne(id);
        post.increment();
        repository.save(post);
        return "redirect:/posts/";
    }

    @RequestMapping(value = "/{id}/downvote", method = RequestMethod.GET)
    public String decrementScore(@PathVariable long id) {
        Post post = repository.findOne(id);
        post.decrement();
        repository.save(post);
        return "redirect:/posts/";
    }



}
