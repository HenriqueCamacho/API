package com.algaworks.algafood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.algaworks.algafood.di.notificacao.NotificadorEmail;

public class NotificacaoConfig {

	@Configuration //Definição de Beans
	public class AlgaConfig {
		
		@Bean
		public NotificadorEmail notificadorEmail() {
			NotificadorEmail notificador = new NotificadorEmail("smtp.algamail.com.br");
			notificador.setCaixaAlta(true);
			
			return notificador;
		}
	
}

}