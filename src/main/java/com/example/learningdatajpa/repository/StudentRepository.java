package com.example.learningdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.learningdatajpa.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    
}