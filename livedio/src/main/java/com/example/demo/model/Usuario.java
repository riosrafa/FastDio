package com.example.demo.model;

import java.math.BigDecimal;

import java.time.LocalDateTime;

import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

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
public class Usuario {

	private Long id;
	
	@ManyToOne
	private UserCategory userCategory;
	
	private String nome;
	
	@ManyToOne
	private NivelAcesso accessLevel;
	
	@ManyToOne
	private Empresa company;
	@ManyToOne
	private JornadaTrabalho workJourney;
	
	private BigDecimal tolerancia;
	
	private LocalDateTime inicioJornada;
	
	private LocalDateTime finalJornada;
	
}
