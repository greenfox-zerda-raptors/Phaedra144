package com.todolist.szilvi;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by ${SzilviaB} on 2016. 11. 17..
 */
public class ToDoList {

    String line;

    public ArrayList<Task> myList = new ArrayList<>();


    public ToDoList() { //akkor fut le, amikor letrehozom az objectem
        try {
            FileI_O fileIO = new FileI_O();
            fileIO.fileCreator();
            this.line = fileIO.readLine();
            while (this.line != null) {
                Task v = this.createTask(line);
                myList.add(v);
                this.line = fileIO.readLine();
            }
            fileIO.reader.close();
        } catch (IOException ex) {
            System.out.println("File can not be open or has an error.");

        }

    }

    public void add(String taskName) {
        Task g = new Task(taskName);
        myList.add(g);

    }


    public void getList() {
        for (int i = 0; i < myList.size(); i++) {
            Task items = myList.get(i);

            System.out.println((i + 1) + " - " + items.toString());
        }
    }

    public void remove(int i) {
        myList.remove(i - 1);
    }

    public void complete(int i) {
        Task item = myList.get(i - 1);
        item.setStatus(true);
    }

    public Task createTask(String x) {
        String[] inputValues = x.split(";", 2);
        Task t = new Task(inputValues[1]);
        if (inputValues[0].contentEquals("checked")) {
            t.setStatus(true);
        }
        else {
            t.setStatus(false);
        }

        return t;
    }


    public void writeList(){
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("toDoList.txt"));
            for (int i = 0; i < myList.size(); i++) {
                Task item = myList.get(i);
                writer.write(item.proba());
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
