package br.com.caixaEletronico.api.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import br.com.caixaEletronico.api.DTO.DadosClienteEntrada;
import br.com.caixaEletronico.api.model.Cliente;
import br.com.caixaEletronico.api.repository.ClienteRepository;

class CadastraClienteServiceTestUni {
	
	@InjectMocks
	CadastraClienteService clienteService;
	
	@Captor
	private ArgumentCaptor<Cliente> captor;
	
	@Mock
	ClienteRepository clienteRepository;
	
	@Mock
	DadosClienteEntrada dadosClienteEntrada;
	
	@Mock
	Cliente cliente;
	
	@BeforeEach
	public void before() { MockitoAnnotations.openMocks(this); }

	@Test
	@DisplayName("função cadastraCliente, comparando dados do objeto cadastrado")
	public void cadastraClienteTest() {
		DadosClienteEntrada clienteEntrada = cliente();
		
		clienteService.cadastraCliente(clienteEntrada);
		
		Mockito.verify(clienteRepository).save(captor.capture());
		
		Cliente cliente = captor.getValue();
		
		assertEquals("11122233344", cliente.getCpfCliente());
		assertEquals("Fulano de Tal", cliente.getNomeCliente());
		assertEquals(15000, cliente.getSaldoCliente());
	}
	
	private DadosClienteEntrada cliente() {
		DadosClienteEntrada cliente = new DadosClienteEntrada();
		
		cliente.setCpfCliente("11122233344");
		cliente.setNomeCliente("Fulano de Tal");
		cliente.setSaldoCliente(15000);
		
		return cliente;
	}

}
