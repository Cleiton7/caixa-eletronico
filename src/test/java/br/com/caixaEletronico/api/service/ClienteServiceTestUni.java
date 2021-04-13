package br.com.caixaEletronico.api.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import br.com.caixaEletronico.api.DTO.DadosClienteEntrada;
import br.com.caixaEletronico.api.model.Cliente;
import br.com.caixaEletronico.api.repository.ClienteRepository;

class ClienteServiceTestUni {
	
	@InjectMocks
	ClienteService clienteService;
	
	@Mock
	ClienteRepository clienteRespository;
	
	@Mock
	DadosClienteEntrada dadosClienteEntrada;
	
	@Mock
	Cliente cliente;
	
	@BeforeEach
	public void before() { MockitoAnnotations.openMocks(this); }

	@Test
	@DisplayName("função cadastraCliente")
	void cadastraClienteTest() {
		cliente.setCpfCliente("11122233344");
		
		String resultCpf = cliente.getCpfCliente();
		
		clienteService.cadastraCliente(dadosClienteEntrada);
		
		assertEquals(11, resultCpf.length());
	}

}
