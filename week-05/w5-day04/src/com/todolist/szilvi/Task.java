package com.todolist.szilvi;

/**
 * Created by ${SzilviaB} on 2016. 11. 17..
 */
public class Task {

    public String name;
    public boolean status;

    public Task (String name){
        this.name = name;
        this.status = false;
    }

    public void setStatus (boolean status){
        this.status = status;
    }

    @Override
    public String toString() {
        if (this.status == true){
            return ("[X] " + this.name);
        }
        else {
            return ("[ ] " + this.name);
        }


    }
}
