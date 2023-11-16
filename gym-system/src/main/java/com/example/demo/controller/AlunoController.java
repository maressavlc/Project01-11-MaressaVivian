package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.model.Aluno;
import com.example.demo.model.CriarCronogramaRequest;
import com.example.demo.model.Cronograma;
import com.example.demo.model.Exercicio;
import com.example.demo.repository.AlunoRepository;
import com.example.demo.repository.CronogramaRepository;
import com.example.demo.repository.ExercicioRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;
    @Autowired
    private ExercicioRepository exercicioRepository;

    @Autowired
    private CronogramaRepository cronogramaRepository;

    @GetMapping
    public List<Aluno> listarAlunos() {
        return alunoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Aluno obterAluno(@PathVariable Long id) {
        return alunoRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Aluno criarAluno(@RequestBody Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    @PutMapping("/{id}")
    public Aluno atualizarAluno(@PathVariable Long id, @RequestBody Aluno novoAluno) {
        novoAluno.setId(id);
        return alunoRepository.save(novoAluno);
    }

    @DeleteMapping("/{id}")
    public void deletarAluno(@PathVariable Long id) {
        alunoRepository.deleteById(id);
    }
    //criar-cronograma, onde {alunoId} é o ID do aluno para o qual você deseja criar um cronograma. Ele recebe um objeto do tipo CriarCronogramaRequest no corpo da requisição e realiza a lógica para criar um cronograma associado ao aluno com base nos exercícios e no dia da semana fornecidos.
    @PostMapping("/{alunoId}/criar-cronograma")
    public ResponseEntity<String> criarCronograma(@PathVariable Long alunoId, @RequestBody CriarCronogramaRequest request) {
        

        if (optionalAluno.isPresent()) {
            Aluno aluno = optionalAluno.get();
            List<Exercicio> exercicios = exercicioRepository.findAllById(request.getExercicioIds());

            Cronograma cronograma = new Cronograma();
            cronograma.setAluno(aluno);
            cronograma.setExercicios(exercicios);
            cronograma.setDiaSemana(request.getDiaSemana());

            cronogramaRepository.save(cronograma);

            return ResponseEntity.ok("Cronograma criado com sucesso!");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    //retorna a lista de todos os exercícios disponíveis no sistema, utilizando o método findAll() do exercicioRepository.
    @GetMapping("/exercicios-disponiveis")
    public List<Exercicio> listarExerciciosDisponiveis() {
        return exercicioRepository.findAll();
    }
}
