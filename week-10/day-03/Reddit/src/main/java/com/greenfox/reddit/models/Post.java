package com.greenfox.reddit.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by ${SzilviaB} on 2017. 01. 04..
 */
@Getter
@Setter
@Entity
@Table
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String content;
    private int score;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateWhenCreated;

    public Post (){
        this.dateWhenCreated = new Date();
    }

    public Post (String content){
        this();
        this.content = content;

    }

    public void increment(){
        score++;
    }

    public void decrement(){
        score--;
    }

}
