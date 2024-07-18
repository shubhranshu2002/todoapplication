package com.example.todo_app.repo;

import com.example.todo_app.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepo extends JpaRepository<TodoItem,Long>{
}
