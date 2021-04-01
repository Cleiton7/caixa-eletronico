package br.com.caixaEletronico.api.DTO;

public class DadosClienteSaida {
	
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
	
	public DadosClienteSaida(String cpfCliente, String nomeCliente, double saldoCliente) {
		super();
		this.cpfCliente = cpfCliente;
		this.nomeCliente = nomeCliente;
		this.saldoCliente = saldoCliente;
	}
}
