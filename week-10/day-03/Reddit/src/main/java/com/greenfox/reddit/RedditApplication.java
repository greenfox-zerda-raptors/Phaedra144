package com.greenfox.reddit;

import com.greenfox.reddit.models.Post;
import com.greenfox.reddit.services.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication implements CommandLineRunner {

	@Autowired
	PostRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(RedditApplication.class, args);
	}


	public void run(String... strings) throws Exception {

	}


}

