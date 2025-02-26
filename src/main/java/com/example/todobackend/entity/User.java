package com.example.todobackend.entity;

import jakarta.persistence.*;
//@Entity
@jakarta.persistence.Entity
@Table(name="user")
public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column
        private String Username;

        @Column
        private String Password;
        void Users() {

        }

    public String getUsername() {
            return Username;
        }

        public void setUsername(String username) {
            Username = username;
        }

        public String getPassword() {
            return Password;
        }

        public void setPassword(String password) {
            Password = password;
        }





}

