package model;

import java.util.List;

public class Pacote {

	private long id;
	private List<Produto> produtos;
	private long end;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}
	
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public long getEnd() {
		return end;
	}
	
	public void setEnd(long end) {
		this.end = end;
	}
	
	public void addProduto(Produto prod) {
		produtos.add(prod);
	}
	
	public void rmvProduto(Produto prod) {
		produtos.remove(prod);
	}
}
