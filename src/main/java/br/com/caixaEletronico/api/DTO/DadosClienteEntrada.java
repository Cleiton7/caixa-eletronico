package br.com.caixaEletronico.api.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class DadosClienteEntrada {
	
	@NotBlank(message = "Preencha o cpf.")
	@Size(min = 11, max= 11, message = "Preencha o cpf corretamente.")
	private String cpfCliente;
	private String nomeCliente;
	private double saldoCliente;
	
	public String getCpfCliente() {
		return cpfCliente;
	}
	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public double getSaldoCliente() {
		return saldoCliente;
	}
	public void setSaldoCliente(double saldoCliente) {
		this.saldoCliente = saldoCliente;
	}
}
