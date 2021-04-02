package br.com.caixaEletronico.api.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.caixaEletronico.api.DTO.DadosClienteEntrada;
import br.com.caixaEletronico.api.service.ClienteService;


@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	@PostMapping(path = "/cadastrar")
	public void cadastraCliente(@Valid @RequestBody DadosClienteEntrada dadosClienteEntrada) {
		clienteService.cadastraCliente(dadosClienteEntrada);
	}
}
