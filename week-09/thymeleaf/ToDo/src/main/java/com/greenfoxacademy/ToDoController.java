package com.greenfoxacademy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by ${SzilviaB} on 2016. 12. 20..
 */
@Controller
@RequestMapping ("/todo")
public class ToDoController {

    private ToDoService todoService;

    @Autowired
    public ToDoController(ToDoService todoService){
        this.todoService = todoService;
    }

    @RequestMapping(value = {"/", "/list"})
    public String list(Model model, @RequestParam (name = "isActive", defaultValue = "false")boolean isActive) {
        model.addAttribute("isActive", isActive);
        model.addAttribute("todos", todoService.getTodos());
        return "todo";
    }

    @RequestMapping(value="/details/{id}")
    public String showDetails(Model model, @PathVariable("id") int id){
        model.addAttribute("currentTodo", todoService.getTodoById(id));
        return "showdetails";
    }

}
