package br.com.alura;

import java.util.List;

public class TestaCurso {
	public static void main(String[] args) {
	
	Curso javacolecoes =  new Curso("Dominando as Coleções do Java", "Paulo Silveira");
	
		List<Aula> aulas = javacolecoes.getAulas();
		System.out.println(aulas);
		
		aulas.add(new Aula("Trabalhando com ArrayList", 21));
		
		System.out.println(aulas);
		
		System.out.println(javacolecoes.getAulas());
	}
}
