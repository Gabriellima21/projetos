package br.com.alura.jpa.testes;

import javax.persistence.Entity;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class TesteCriaTabelas {
	public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("conta");
	EntityManager createEntityManager = emf.createEntityManager();
	emf.close();
 }
}
