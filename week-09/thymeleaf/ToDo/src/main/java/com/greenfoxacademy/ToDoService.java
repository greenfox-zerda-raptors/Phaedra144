package com.greenfoxacademy;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ${SzilviaB} on 2016. 12. 20..
 */
@Component
public class ToDoService {
    private List<Todo> fakeTodoStore = new ArrayList<Todo>(
            Arrays.asList(
                    new Todo(0, "Create an action", true, true),
                    new Todo(1, "Add @RequestMapping to it"),
                    new Todo(2, "Return the viewName from the action")));

    public List<Todo> getTodos() {
        return fakeTodoStore;
    }

    public void addTodo(Todo todo){
        if(todo.getId() == 0){
            todo.setId(fakeTodoStore.size());
        }
        fakeTodoStore.add(todo);
    }

    public Todo getTodoById(int id){
        for(Todo todoItem:fakeTodoStore){
            if(id == todoItem.getId()+1){
                return todoItem;
            }

        }
            return new Todo(id, "todo not existing");
    }

}
