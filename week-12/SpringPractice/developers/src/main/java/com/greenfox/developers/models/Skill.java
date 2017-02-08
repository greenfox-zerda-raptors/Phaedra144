package com.greenfox.developers.models;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by ${SzilviaB} on 2017. 01. 22..
 */
@Getter
@Setter
@Entity
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String label;
    private String description;

    public Skill() {
        super();
    }

    public Skill(String label, String description) {
        super();
        this.label = label;
        this.description = description;
    }


}
