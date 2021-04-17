package br.com.caixaEletronico.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.caixaEletronico.api.DTO.DadosClienteSaida;
import br.com.caixaEletronico.api.DTO.DadosClienteSaqueEntrada;
import br.com.caixaEletronico.api.model.Cliente;
import br.com.caixaEletronico.api.repository.ClienteRepository;

public class EfetuaSaqueService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public DadosClienteSaida efetuaSaque(Long clienteId, DadosClienteSaqueEntrada dadosClienteSaqueEntrada) {

		Optional<Cliente> cliente = clienteRepository.findById(clienteId);

		DadosClienteSaida dadosClienteSaida = new DadosClienteSaida(cliente.get().getIdCliente(),
				cliente.get().getSaldoCliente());

		return dadosClienteSaida;
	}
}
