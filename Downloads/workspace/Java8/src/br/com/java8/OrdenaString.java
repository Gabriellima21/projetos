package br.com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenaString {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		
		palavras.add("alura online");
		palavras.add("editora casa de codigos");
		palavras.add("caelum");
		
		Comparator<String> comparador = new ComparadorPorTamanho();
		
		palavras.sort(comparador);
		
		for (String p : palavras) {
			System.out.println(p);

		}
		
	}

}
	
class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length())
			return -1;
		if (s1.length() > s2.length())
			return 1;
		

	}	
}