package br.com.caixaEletronico.api.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
@AllArgsConstructor
public class DadosClienteEntrada {
	
	@NotBlank(message = "Preencha o cpf.")
	@Size(min=8, max=11, message = "Preencha o cpf corretamente.")
	@JsonProperty("cpf_cliente")
	private String cpfCliente;
	
	@NotBlank(message = "Preencha o nome.")
	@Size(min=3, max=50, message = "Preencha o nome corretamente.")
	@JsonProperty("nome_cliente")
	private String nomeCliente;
	
//	@NotBlank(message = "Preencha o saldo.")
//	@Size(min=2, max=14, message = "Preencha o saldo corretamente.")
	@JsonProperty("saldo_cliente")
	private double saldoCliente;
	
	
}
