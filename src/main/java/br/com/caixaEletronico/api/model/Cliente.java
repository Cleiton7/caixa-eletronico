package br.com.caixaEletronico.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name = "TB_CLIENTE")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_cliente")
	private Long idCliente;
	
	@NotNull
	@Column(name = "cpf_cliente")
	private String cpfCliente;
	
	@NotNull
	@Column(name = "nm_cliente")
	private String nomeCliente;
	
	@NotNull
	@Column(name = "sd_cliente")
	private double saldoCliente;
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(String cpfCliente, String nomeCliente, double saldoCliente) {
		super();
		this.cpfCliente = cpfCliente;
		this.nomeCliente = nomeCliente;
		this.saldoCliente = saldoCliente;
	}
}
