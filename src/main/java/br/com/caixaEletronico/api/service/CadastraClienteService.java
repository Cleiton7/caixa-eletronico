package br.com.caixaEletronico.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.caixaEletronico.api.DTO.DadosClienteEntrada;
import br.com.caixaEletronico.api.model.Cliente;
import br.com.caixaEletronico.api.repository.ClienteRepository;

@Service
public class CadastraClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	public void cadastraCliente(DadosClienteEntrada dadosClienteEntrada) {

		Cliente cliente = new Cliente(
				dadosClienteEntrada.getCpfCliente(),
				dadosClienteEntrada.getNomeCliente(),
				dadosClienteEntrada.getSaldoCliente()
				);

		clienteRepository.save(cliente);
	}
}
