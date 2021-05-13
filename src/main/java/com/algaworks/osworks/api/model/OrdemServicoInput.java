package com.algaworks.osworks.api.model;

import java.math.BigDecimal;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

import com.sun.istack.NotNull;

public class OrdemServicoInput {
	
	@NotBlank
	private String descricao;
	
	@NotNull
	private BigDecimal preco;
	
	@Valid
	@NotNull
	private String clienteIdInput;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public String getClienteIdInput() {
		return clienteIdInput;
	}
	public void setClienteIdInput(String clienteIdInput) {
		this.clienteIdInput = clienteIdInput;
	}
	
	
	

}
