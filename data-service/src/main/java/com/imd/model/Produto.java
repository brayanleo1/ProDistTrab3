package com.imd.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Produto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column
	private String nome;
	
	@Column
	private double valor;
	
	@Column
	private Date fab;
	
	@Column
	private Date val;
	
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
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public Date getFab() {
		return fab;
	}
	
	public void setFab(Date fab) {
		this.fab = fab;
	}
	
	public Date getVal() {
		return val;
	}
	
	public void setVal(Date val) {
		this.val = val;
	}
}
