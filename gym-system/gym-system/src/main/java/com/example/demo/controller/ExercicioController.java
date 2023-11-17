package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Exercicio;
import com.example.demo.repository.ExercicioRepository;

import java.util.List;

@RestController
@RequestMapping("/exercicios")
public class ExercicioController {

    @Autowired
    private ExercicioRepository exercicioRepository;
    

    @GetMapping
    public List<Exercicio> listarExercicios() {
        return exercicioRepository.findAll();
    }

    @GetMapping("/{id}")
    public Exercicio obterExercicio(@PathVariable Long id) {
        return exercicioRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Exercicio criarExercicio(@RequestBody Exercicio exercicio) {
        return exercicioRepository.save(exercicio);
    }

    @PutMapping("/{id}")
    public Exercicio atualizarExercicio(@PathVariable Long id, @RequestBody Exercicio novoExercicio) {
        return exercicioRepository.findById(id)
                .map(exercicio -> {
                    exercicio.setNome(novoExercicio.getNome());
                    exercicio.setDescricao(novoExercicio.getDescricao());
                    return exercicioRepository.save(exercicio);
                })
                .orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletarExercicio(@PathVariable Long id) {
        exercicioRepository.deleteById(id);
    }
    @GetMapping("/disponiveis")
    public List<Exercicio> listarExerciciosDisponiveis() {
        return exercicioRepository.findAll();
    }
}
