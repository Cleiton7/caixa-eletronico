package br.com.caixaEletronico.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.caixaEletronico.api.DTO.DadosClienteSaida;
import br.com.caixaEletronico.api.model.Cliente;
import br.com.caixaEletronico.api.repository.ClienteRepository;

@Service
public class BuscaSaldoService {
	
	@Autowired
	private ClienteRepository clienteRepository;

	public DadosClienteSaida buscaSaldo(Long clienteId) {

		Optional<Cliente> cliente = clienteRepository.findById(clienteId);

		DadosClienteSaida dadosClienteSaida = new DadosClienteSaida(
				cliente.get().getIdCliente(),
				cliente.get().getSaldoCliente()
				);

		return dadosClienteSaida;
	}

}
