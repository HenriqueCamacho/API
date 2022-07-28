package com.algaworks.di.modelo;

import java.math.BigDecimal;

public class Produto {
	private String nomeString;
	private BigDecimal valorTotal;
	public Produto(String nomeString, BigDecimal valorTotal) {
		super();
		this.nomeString = nomeString;
		this.valorTotal = valorTotal;
	}
	public String getNomeString() {
		return nomeString;
	}
	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	
	
}
