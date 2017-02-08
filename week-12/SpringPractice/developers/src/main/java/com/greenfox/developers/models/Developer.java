package com.greenfox.developers.models;

import lombok.*;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by ${SzilviaB} on 2017. 01. 22..
 */

@Setter
@AllArgsConstructor
@Entity
public class Developer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotEmpty
    private String firstName;

    @NotEmpty
    private String lastName;

    @Email
    private String email;
    @ManyToMany
    private List<Skill> skills;

    public Developer() {
        super();
    }

    public Developer(String firstName, String lastName, String email,
                     List<Skill> skills) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.skills = skills;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public boolean hasSkill(Skill skill){
        for (Skill containedSkill : getSkills()){
            if (containedSkill.getId() == skill.getId()){
                return true;
            }
        }
        return false;
    }
}