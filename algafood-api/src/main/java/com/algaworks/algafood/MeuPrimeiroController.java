package com.algaworks.algafood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.algaworks.algafood.di.service.AtivacaoClienteService;
import com.algaworks.algafood.di.modelo.Cliente;


@Controller
public class MeuPrimeiroController {
	
	private AtivacaoClienteService ativacaoClienteService;
	
	
	
	public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
		System.out.println("AtivacaoMeuPrimeiroController: "+ativacaoClienteService);
	}



	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		Cliente henrique = new Cliente("Henrique", "harrycamachofarias@hotmail.com", "65992695612");
			
		ativacaoClienteService.ativar(henrique);
		
		return "something";
	}
}
