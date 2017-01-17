package com.greenfox.szilvi.calorie.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by ${SzilviaB} on 2017. 01. 13..
 */
@Getter
@Setter
@Entity
@Table(name="users")
public class User {

    @Id
    private String username;
    private String password;


}
