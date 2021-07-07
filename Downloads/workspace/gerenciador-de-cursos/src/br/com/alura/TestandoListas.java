package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
		
		String aula1 = "Conhcendo mais de listas";
		String aula2 = "Modelando a classe Alura";
		String aula3 = "Trabalhando com Cursos e Sets";
		
		ArrayList<String> aulas = new ArrayList<String>();
		
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aula1);
		
		aulas.remove(0);
		System.out.println(aulas);
		
	    for (String aula : aulas) {
	    	
	    	System.out.println("Aulas: " + aulas);
		
	    	Collections.sort(aulas);
	    		System.out.println("Ordenando Aulas");
	    		System.out.println(aulas);
	    		
	    		
	    	}
		}
		
	

}
