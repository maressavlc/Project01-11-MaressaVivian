package com.example.demo.model;

import java.util.List;

public class CriarCronogramaRequest {
	 private List<Long> exercicioIds;
	    private DiaSemana diaSemana;
		public List<Long> getExercicioIds() {
			return exercicioIds;
		}
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
