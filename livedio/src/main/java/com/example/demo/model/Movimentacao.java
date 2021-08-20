package com.example.demo.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Embeddable;

import javax.persistence.EmbeddedId;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Movimentacao {

	@AllArgsConstructor
	@NoArgsConstructor
	@EqualsAndHashCode
	@Embeddable
	public class MovimentacaoId implements Serializable {

		private Long idMovemento;

		private Long idUsuario;

	}

	@EmbeddedId
	private MovimentacaoId movid;
	private LocalDateTime dataEntrega;
	private LocalDateTime dataSaida;
	private BigDecimal periodo;
	private Ocorrencia ocorrencias;
	private Calendario calendario;

}
