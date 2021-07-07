package br.com.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Curso {
		    private String nome;
		    private int alunos;

		    public Curso(String nome, int alunos) {
		        this.nome = nome;
		        this.alunos = alunos;
		    }

		    public String getNome() {
		        return nome;
		    }

		    public int getAlunos() {
		        return alunos;
	}
}

public class ExemploCurso {
	public static void main(String[] args) {
		
		List<String> cursos = new ArrayList<>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		cursos.sort(Comparator.comaring(Curso::getAlunos));
		
		//cursos.forEach(action);
	}
	
	
}
