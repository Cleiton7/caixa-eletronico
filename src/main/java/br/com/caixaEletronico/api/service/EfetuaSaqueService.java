package br.com.caixaEletronico.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.caixaEletronico.api.DTO.DadosClienteSaqueEntrada;
import br.com.caixaEletronico.api.DTO.DadosClienteSaqueSaida;
import br.com.caixaEletronico.api.model.Cliente;
import br.com.caixaEletronico.api.repository.ClienteRepository;

@Service
public class EfetuaSaqueService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public DadosClienteSaqueSaida efetuaSaque(DadosClienteSaqueEntrada dadosClienteSaqueEntrada, Long clienteId) {
		
		DadosClienteSaqueSaida dadosClienteSaida;

		Optional<Cliente> cliente = clienteRepository.findById(clienteId);

		if(cliente.isPresent()) {
			double novoSaldo = cliente.get().getSaldoCliente() - dadosClienteSaqueEntrada.getSaqueCliente();
			cliente.get().setSaldoCliente(novoSaldo);
			clienteRepository.save(cliente.get());
		}
		
		dadosClienteSaida = new DadosClienteSaqueSaida(
				dadosClienteSaqueEntrada.getSaqueCliente(),
				cliente.get().getSaldoCliente()
				);
		
		return dadosClienteSaida;
		
	}
}
