package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Exercicio;

public interface ExercicioRepository extends JpaRepository<Exercicio, Long> {
    
}
