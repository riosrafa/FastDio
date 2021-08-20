package com.example.demo.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;

import com.example.demo.model.Movimentacao.MovimentacaoId;

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
public class BancoHoras {

	@AllArgsConstructor
	@NoArgsConstructor
	@EqualsAndHashCode
	@Embeddable
	public class BancoHorasId implements Serializable{
		private Long idBancoHoras;
		private Long idMovimentacao;
		private Long idUsuario;
	}
	@EmbeddedId
	private BancoHoras id;
	
	private LocalDateTime data;
	private BigDecimal quantidadeHoras;
	private BigDecimal saldoHoras;
	
}
