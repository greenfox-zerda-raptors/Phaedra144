package com.greenfoxacademy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.concurrent.atomic.LongAccumulator;

/**
 * Created by ${SzilviaB} on 2016. 12. 20..
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Todo {

    public int id;
    public String title;
    public boolean urgent;
    public boolean done;

    public Todo(int id, String title) {
        this(id, title, false, false);
    }

}
