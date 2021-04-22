package br.com.caixaEletronico.api.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DadosClienteSaida {
	
	private Long idCliente;
	private double saldoCliente;
}
