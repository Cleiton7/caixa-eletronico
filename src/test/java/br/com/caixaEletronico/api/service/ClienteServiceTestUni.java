package br.com.caixaEletronico.api.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import br.com.caixaEletronico.api.DTO.DadosClienteEntrada;
import br.com.caixaEletronico.api.repository.ClienteRepository;

class ClienteServiceTestUni {
	
	@InjectMocks
	ClienteService clienteService;
	
	@Mock
	ClienteRepository clienteRespository;
	
	@Mock
	DadosClienteEntrada dadosClienteEntrada;

	@Test
	@DisplayName("função cadastraCliente")
	void cadastraClienteTest() {
		clienteService.cadastraCliente(dadosClienteEntrada);
	}

}
