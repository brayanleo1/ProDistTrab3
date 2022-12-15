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
public class Fabrica {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column
	private String nome;
	
	@OneToMany
	private List<Produto> fabricados;
	
	@OneToMany
	private List<Pacote> pacotes;
	
	public Fabrica() {
		this.fabricados = new ArrayList<Produto>();
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

	public List<Produto> getFabricados() {
		return fabricados;
	}

	public void setFabricados(List<Produto> fabricados) {
		this.fabricados = fabricados;
	}

	public List<Pacote> getPacotes() {
		return pacotes;
	}

	public void setPacotes(List<Pacote> pacotes) {
		this.pacotes = pacotes;
	}
}
