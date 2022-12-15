package com.imd.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.OneToMany;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Loja {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column
	private String nome;
	
	@OneToMany
	private List<Produto> pratileira;
	
	@OneToMany
	private List<Pacote> pacotes;
	
	public Loja() {
		this.pratileira = new ArrayList<Produto>();
		this.pacotes = new ArrayList<Pacote>();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Produto> getPratileira() {
		return pratileira;
	}

	public void setPratileira(List<Produto> pratileira) {
		this.pratileira = pratileira;
	}

	public List<Pacote> getPacotes() {
		return pacotes;
	}

	public void setPacotes(List<Pacote> pacotes) {
		this.pacotes = pacotes;
	}
}
