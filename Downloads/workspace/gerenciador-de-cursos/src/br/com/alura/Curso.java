package br.com.alura;

import java.util.List;

public class Curso {
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new List<Aula>();
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	public List<Aula> getAulas() {
		return aulas;
	
	}
	public void adiciona (Aula aula) {
		this.aulas.add(aula);
	}
	public int getTempoTotal() {
	    int tempoTotal = 0;
	    for (Aula aula : aulas) {
	        tempoTotal += aula.getTempo();
	    }
	    return tempoTotal;
	}
}
