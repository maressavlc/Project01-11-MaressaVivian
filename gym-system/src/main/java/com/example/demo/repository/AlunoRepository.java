package com.example.demo.repository;

import com.example.demo.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
// interface do Spring Data JPA, que é responsável por fornecer operações básicas de persistência para a entidade Aluno
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
  
}
