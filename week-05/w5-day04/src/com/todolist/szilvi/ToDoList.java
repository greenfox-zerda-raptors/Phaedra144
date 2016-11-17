package com.todolist.szilvi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by ${SzilviaB} on 2016. 11. 17..
 */
public class ToDoList {

    FileI_O fileIO = new FileI_O();
    String line;

    public ArrayList<Task> myList = new ArrayList<>();

    public ToDoList() { //akkor fut le, amikor letrehozom a constructorom
        this.fileIO.fileCreator();
        this.line = fileIO.readLine();
        while (this.line!= null){
            Task t = this.createTask(line);
            myList.add(t);
        }
    }



    public void add(String taskName)
    {
        myList.add(new Task(taskName));
    }

    public void getList()
    {
        for (int i=0; i < myList.size(); i++) {
            Task items = myList.get(i);

            System.out.println((i+1) + " - " + items.toString());
        }
    }

    public void remove(int i){
        myList.remove(i-1);
    }

    public void complete(int i){
        Task item = myList.get(i-1);
        item.setStatus(true);
    }

    public Task createTask(String x){
        String[] inputValues = x.split(";", 2);
        Task t = new Task(inputValues[1]);
        if(inputValues[0] == "checked"){
            t.setStatus(true);
        }

        return t;
    }











}
