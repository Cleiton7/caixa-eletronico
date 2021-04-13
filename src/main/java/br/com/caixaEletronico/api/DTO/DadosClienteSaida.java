package br.com.caixaEletronico.api.DTO;

public class DadosClienteSaida {
	
	private Long idCliente;
	private double saldoCliente;
	
	public Long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}
	public double getSaldoCliente() {
		return saldoCliente;
	}
	public void setSaldoCliente(double saldoCliente) {
		this.saldoCliente = saldoCliente;
	}
	
	public DadosClienteSaida(Long idCliente, double saldoCliente) {
		super();
		this.idCliente = idCliente;
		this.saldoCliente = saldoCliente;
	}
}
