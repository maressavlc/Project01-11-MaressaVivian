package com.example.demo.model;



import jakarta.persistence.*;
import java.util.List;

@Entity
public class Cronograma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Aluno aluno;

    @ManyToMany
    @JoinTable(
        name = "cronograma_exercicios",
        joinColumns = @JoinColumn(name = "cronograma_id"),
        inverseJoinColumns = @JoinColumn(name = "exercicio_id"))
    private List<Exercicio> exercicios;

    @Enumerated(EnumType.STRING)
    private DiaSemana diaSemana;

    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public List<Exercicio> getExercicios() {
        return exercicios;
    }

    public void setExercicios(List<Exercicio> exercicios) {
        this.exercicios = exercicios;
    }

    public DiaSemana getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(DiaSemana diaSemana) {
        this.diaSemana = diaSemana;
    }
}

