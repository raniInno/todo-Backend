package com.example.todobackend.entity;

import jakarta.persistence.*;

@jakarta.persistence.Entity
@Table(name= "todos")
public class Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    @Column(name = "todo")
    private String todo;
    @Column(name="Status")
    private String Status;
    @Column
    private String description;


    public void setDescription(String description) {

        this.description = description;
    }



    public Entity(String status, String todo, long id) {
        Status = status;
        this.todo = todo;
        this.id = id;
    }

    public Entity() {

    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }




}
