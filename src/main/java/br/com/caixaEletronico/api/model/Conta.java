package br.com.caixaEletronico.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "TB_CONTA")
public class Conta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_conta")
	private Long idConta;
	
	@Column(name = "nm_agencia_conta")
	private Long numAgenciaConta;
	
	@Column(name = "nm_conta")
	private String numConta;
	
	@OneToOne(mappedBy = "conta")
	private Cliente cliente;
}
