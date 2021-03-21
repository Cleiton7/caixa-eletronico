package br.com.caixaEletronico.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "TB_CLIENTE")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cliente")
	private Long idCliente;
	
	@Column(name = "cpf_cliente")
	private String cpfCliente;
	
	@Column(name = "nm_cliente")
	private String nomeCliente;
	
	@Column(name = "sd_cliente")
	private double saldoCliente;
	
	@OneToOne
	@JoinColumn(name = "fk_id_conta")
	private Conta conta;
}
