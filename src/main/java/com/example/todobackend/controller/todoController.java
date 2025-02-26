package com.example.todobackend.controller;

import com.example.todobackend.entity.Entity;
import com.example.todobackend.repository.TodosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@Controller
@RequestMapping("/todoApp")
public class todoController {
   @Autowired
   private TodosRepository todosRepository;

   //to get the all the todos
   @GetMapping("/alltodos")
   public List<Entity> getAllTodos (){
      return todosRepository.findAll();
   }

   @GetMapping("/todo/{id}")
   public void getTodoById(@RequestParam long id){


   }

   @PostMapping("/create")
   public String createtodo(@RequestBody String entity) {

       return entity;
   }

   @PutMapping("todo/{id}")
   public String putMethodName(@PathVariable Long id, @RequestBody String entity) {
       
       
       return entity;
   }
   @DeleteMapping("todo/{id}")
   public void deletetodobyId(@PathVariable long id){
    
   }
   
}
