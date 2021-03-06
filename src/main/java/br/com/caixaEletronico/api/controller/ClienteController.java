package br.com.caixaEletronico.api.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.caixaEletronico.api.DTO.DadosClienteEntrada;
import br.com.caixaEletronico.api.DTO.DadosClienteSaida;
import br.com.caixaEletronico.api.DTO.DadosClienteSaqueEntrada;
import br.com.caixaEletronico.api.DTO.DadosClienteSaqueSaida;
import br.com.caixaEletronico.api.service.BuscaSaldoService;
import br.com.caixaEletronico.api.service.CadastraClienteService;
import br.com.caixaEletronico.api.service.EfetuaSaqueService;


@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private CadastraClienteService clienteService;
	
	@Autowired
	private BuscaSaldoService saldoService;
	
	@Autowired
	private EfetuaSaqueService saqueService;
	
	@PostMapping(path = "/cadastrar")
	public void cadastraCliente(@Valid @RequestBody DadosClienteEntrada dadosClienteEntrada) {
		clienteService.cadastraCliente(dadosClienteEntrada);
	}
	
	@GetMapping(path = "/{id}")
	public DadosClienteSaida buscaSaldoCliente(@PathVariable Long id) {
		DadosClienteSaida dadosCliente = saldoService.buscaSaldo(id);
		return dadosCliente;
	}
	
	@PostMapping(path = "/{id}/sacar")
	public DadosClienteSaqueSaida efetuaSaque(@Valid @RequestBody DadosClienteSaqueEntrada dadosClienteSaqueEntrada, @PathVariable Long id) {
		DadosClienteSaqueSaida dadosCliente = saqueService.efetuaSaque(dadosClienteSaqueEntrada, id);
		return dadosCliente;
	}
}
