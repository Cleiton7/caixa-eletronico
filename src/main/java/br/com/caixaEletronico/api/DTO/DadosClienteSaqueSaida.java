package br.com.caixaEletronico.api.DTO;

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
public class DadosClienteSaqueSaida {
	
	@JsonProperty("saque_cliente")
	private double saqueCliente;
	
	@JsonProperty("novo_saldo_cliente")
	private double novoSaldoCliente;
}
