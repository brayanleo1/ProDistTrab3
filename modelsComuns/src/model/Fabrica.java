package model;

import java.util.ArrayList;
import java.util.List;

public class Fabrica {
	private long id;
	private String nome;
	private List<Produto> fabricados;
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
