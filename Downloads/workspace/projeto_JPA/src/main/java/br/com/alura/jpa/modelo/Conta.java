package br.com.alura.jpa.modelo;

import javax.persistence.Entity;

@Entity

public class Conta {
@Id
@GeneratedValue (strategy = GenerationType.INDENTITY)

	private Long id;
	private Integer agecia;
	private Integer numero;
	private String titular;
	private double saldo: 
	public Integer getAgecia() {
		return agecia;
	}

	public void setAgecia(Integer agecia) {
		this.agecia = agecia;
	}

	public Integer getNumero() {
		return numero;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

}
