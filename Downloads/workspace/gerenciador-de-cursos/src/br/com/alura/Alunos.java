package br.com.alura;

import java.util.Set;
import java.util.List;
import java.util.Collections;
import java.util.HashSet;

public class Alunos {

	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		
		alunos.add("Gabriel");
		alunos.add("Vera");
		alunos.add("Aline");
		
		for (String aluno : alunos) {
			System.out.println(alunos);
		}
		
	}
}
