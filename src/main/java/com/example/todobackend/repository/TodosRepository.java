package com.example.todobackend.repository;

import com.example.todobackend.entity.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodosRepository extends JpaRepository<Entity, Long> {

}
