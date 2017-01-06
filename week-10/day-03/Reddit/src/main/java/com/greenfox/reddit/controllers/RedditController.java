package com.greenfox.reddit.controllers;
import com.greenfox.reddit.models.Post;
import com.greenfox.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



/**
 * Created by ${SzilviaB} on 2017. 01. 04..
 */
@Controller
@RequestMapping("/posts")
public class RedditController {


    PostService postService;

    @Autowired
    public RedditController(PostService postService) {
        this.postService = postService;
    }

    @RequestMapping("/hello")
    public String greeting (){
        return "helloworld";
    }

    @RequestMapping(value = {"","/"})
    public String list(Model model, Pageable pageable) {
        model.addAttribute("posts", postService.findPosts(pageable));
//        model.addAttribute("posts", postService.findFirst5());
        return "list_posts";
    }

    @GetMapping("/add")
    public String addPost (Model model) {
        postService.addPost(model);
        return "add_post";
    }

    @PostMapping("/add")
    public String createPost(@ModelAttribute Post post) {
        postService.savePost(post);
        return "redirect:/posts";
    }

    @RequestMapping(value = "/{id}/upvote", method = RequestMethod.GET)
    public String incrementScore(@PathVariable long id) {
       postService.upvoting(id);
        return "redirect:/posts";
    }

    @RequestMapping(value = "/{id}/downvote", method = RequestMethod.GET)
    public String decrementScore(@PathVariable long id) {
        postService.downvoting(id);
        return "redirect:/posts";
    }



}
