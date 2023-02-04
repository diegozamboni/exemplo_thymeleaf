package br.edu.unoesc.exemplo_thymeleaf;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Produto {
	private String nome;
	private Integer quantidade;
	private BigDecimal valor;
	
	public Produto() {
		super();
	}

	public Produto(String nome, Integer quantidade, BigDecimal valor) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	
	

}
