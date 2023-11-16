package com.example.demo.model;

import java.util.List;

public class CriarCronogramaRequest {
	 private List<Long> exercicioIds;
	    private DiaSemana diaSemana;
	    //Getter para obter a lista de IDs dos exercícios
		public List<Long> getExercicioIds() {
			return exercicioIds;
		}
		//Setter para definir a lista de IDs dos exercícios
		public void setExercicioIds(List<Long> exercicioIds) {
			this.exercicioIds = exercicioIds;
		}
		public DiaSemana getDiaSemana() {
			return diaSemana;
		}
		public void setDiaSemana(DiaSemana diaSemana) {
			this.diaSemana = diaSemana;
		}

}
