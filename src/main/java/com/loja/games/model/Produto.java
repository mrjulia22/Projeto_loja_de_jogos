package com.loja.games.model;

import java.math.BigDecimal;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produtos")
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "O nome do produto é obrigatório, ")
	@Size(min = 5, max = 100, message = "O atributo nome deve conter no minimo 5 e no máximo 100 caracteres")
	private String nomeProduto;

	@NotBlank(message = "A descrição do produto é obrigatório, ")
	@Size(min = 5, max = 1000, message = "O atributo nome deve conter no minimo 5 e no máximo 1000 caracteres")
	private String descricaoProduto;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
    @Positive(message = "Digite um valor maior do que zero")
	private BigDecimal precoProduto;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public BigDecimal getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(BigDecimal precoProduto) {
		this.precoProduto = precoProduto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


}
