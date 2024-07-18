package com.example.todo_app.controller;

import com.example.todo_app.model.TodoItem;
import com.example.todo_app .repo.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController//telling us this is a restful api service
@RequestMapping(value = "/todo")

public class TodoController {

    @Autowired  //Automatically injects dependencies by type.
    private TodoRepo todoRepo;


    @GetMapping
    public List<TodoItem> findAll() {
        return todoRepo.findAll();
    }

    @PostMapping
    public TodoItem save(@RequestBody @NonNull @Validated TodoItem todoitem) {
        return todoRepo.save(todoitem);

    }
}
