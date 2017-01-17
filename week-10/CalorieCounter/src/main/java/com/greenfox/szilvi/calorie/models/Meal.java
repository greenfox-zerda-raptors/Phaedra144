package com.greenfox.szilvi.calorie.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by ${SzilviaB} on 2017. 01. 08..
 */
@Entity
@Table(name="meals")
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String createdAt;
    private String name;
    private int calorie;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private MealType type;

    public Meal (){

    }

    public Meal (String name, int calorie, MealType type){
        this.createdAt = "10/01/2017, 15:09:23";
        this.name = name;
        this.calorie = calorie;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public MealType getType() {
        return type;
    }

    public void setType(MealType type) {
        this.type = type;
    }
}
