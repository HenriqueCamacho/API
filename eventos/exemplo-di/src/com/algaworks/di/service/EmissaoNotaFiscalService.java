package com.algaworks.di.service;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.modelo.Produto;
import com.algaworks.di.notificacao.Notificador;

public class EmissaoNotaFiscalService {

	private Notificador notificador;
	
	
	
	public EmissaoNotaFiscalService(Notificador notificador) {
		this.notificador = notificador;
	}



	public void emitir(Cliente cliente, Produto produto) {
		//TODO emite nota fiscal
		
		notificador.notificar(cliente, "Nota fiscal do produto "+
					produto.getNomeString() + "foi emitida!");
	}
}
