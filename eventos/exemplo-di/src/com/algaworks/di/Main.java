package com.algaworks.di;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.notificacao.Notificador;
import com.algaworks.di.notificacao.NotificadorEmail;
import com.algaworks.di.notificacao.NotificadorSMS;
import com.algaworks.di.service.AtivacaoClienteService;

public class Main {
	
	public static void main(String[] args) {
		
	Notificador notificador = new NotificadorSMS();
		
	Cliente henrique = new Cliente("Henrique", "harrycamachofarias@hotmail.com", "65992695612");
	Cliente bomdiaecia = new Cliente("Bom dia & Cia", "ps2@hotmail.com", "40028922");
		
	AtivacaoClienteService ativacaoCliente	= new AtivacaoClienteService(notificador);
	ativacaoCliente.ativar(henrique);
	ativacaoCliente.ativar(bomdiaecia);
	
	}
}
