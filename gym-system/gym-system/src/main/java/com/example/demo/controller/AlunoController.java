

package com.example.demo.controller;

import com.example.demo.model.Aluno;
import com.example.demo.model.CriarCronogramaRequest;
import com.example.demo.model.Cronograma;
import com.example.demo.model.Exercicio;
import com.example.demo.repository.AlunoRepository;
import com.example.demo.repository.CronogramaRepository;
import com.example.demo.repository.ExercicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

  
    @GetMapping
    public List<Aluno> listarAlunos() {
        return alunoRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Aluno> obterAluno(@PathVariable Long id) {
        Optional<Aluno> optionalAluno = alunoRepository.findById(id);
        return optionalAluno.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    } 

    @PostMapping
    public Aluno criarAluno(@RequestBody Aluno aluno) {
       
    return alunoRepository.save(aluno);
    }        
        
    

     @PutMapping("/{id}")
    public ResponseEntity<Aluno> atualizarAluno(@PathVariable Long id, @RequestBody Aluno novoAluno) {
        novoAluno.setId(id);
        try {
            Aluno alunoAtualizado = alunoRepository.save(novoAluno);
            return ResponseEntity.ok(alunoAtualizado);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

   @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarAluno(@PathVariable Long id) {
        try {
            alunoRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    } 
    } 

  

   
