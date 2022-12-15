package model;

import java.util.ArrayList;
import java.util.List;

public class Loja {
	private long id;
	private String nome;
	private List<Produto> pratileira;
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
