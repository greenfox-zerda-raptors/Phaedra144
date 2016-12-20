package com.greenfoxacademy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String list(Model model) {
        return "todo";
    }

}
