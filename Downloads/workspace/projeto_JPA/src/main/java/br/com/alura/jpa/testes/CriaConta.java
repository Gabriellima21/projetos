package br.com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta;

public class CriaConta {
	public static void main(String[] args) {
		EntityManagerFactory emf + Persistence.createEntityManagerFactory("Alura");
		EntityManager em = emf.createEntityManager();
		
		
		Conta conta = new Conta ();
		conta.setTitular("Gabriel");
		conta.setNumero(1542);
		conta.setAgecia(43586);
		
		em.getTransaction().begin ();
		
		em.presist(conta);
		 
		em.getTransaction().commit();
		
		
	}

}
