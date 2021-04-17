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
public class DadosClienteSaqueEntrada {
	
//	@NotBlank(message = "Preencha o valor do saque.")
//	@Size(min=2, max=14, message = "Preencha o valor de saque corretamente.")
	@JsonProperty("saque_cliente")
	private double saqueCliente;
}
