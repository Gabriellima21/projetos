package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListadeAula {

	public static void main(String[] args) {

		 Aula a1 = new Aula("Revisitando as ArrayLists" , 21);
		 Aula a2 = new Aula ("Listas e objetos" , 15);
		 Aula a3 = new Aula ("Relacionamentos de Listas e Objetos" , 20);
		 
		 ArrayList<Aula> aulas = new ArrayList<>();
		 
		 aulas.add (a1);
		 aulas.add (a2);
	     aulas.add (a3);
		 
	     System.out.println(aulas);
	     
	     Collections.sort (aulas); 
	     
	     System.out.println(aulas);
	     
	     Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
	     
	}

}
