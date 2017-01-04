package com.greenfox.reddit.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by ${SzilviaB} on 2017. 01. 04..
 */
@Getter
@Setter
@Entity
@Table(name="reddit")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String content;
    private int score;

    public Post (){

    }

    public Post (String content){
        this.content = content;
    }

    public void increment(){
        score++;
    }

    public void decrement(){
        score--;
    }

}
