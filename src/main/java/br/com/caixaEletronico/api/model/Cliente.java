package br.com.caixaEletronico.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TB_CLIENTE")
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cliente")
	private Long idCliente;
	
	@NotNull
	@Column(name = "cpf_cliente", length = 11)
	private String cpfCliente;
	
	@NotNull
	@Column(name = "nm_cliente", length = 50)
	private String nomeCliente;
	
	@NotNull
	@Column(name = "sd_cliente", length = 14)
	private double saldoCliente;

	public Cliente(String cpfCliente, String nomeCliente, double saldoCliente) {
		super();
		this.cpfCliente = cpfCliente;
		this.nomeCliente = nomeCliente;
		this.saldoCliente = saldoCliente;
	}
}
