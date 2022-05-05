package com.loja.games.model;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O modelo do playstation é obrigatório")
	@Size(min = 5, max = 100, message = "O atributo título deve conter no minimo 5 e no máximo 100 caracteres")
	private String tituloCategoria;

	@NotBlank(message = "O modelo do playstation é obrigatório")
	@Size(min = 5, max = 100, message = "O atributo título deve conter no minimo 5 e no máximo 100 caracteres")
	private String console;

	@NotBlank(message = "O modelo do nintendo é obrigatório")
	@Size(min = 5, max = 100, message = "O atributo título deve conter no minimo 5 e no máximo 100 caracteres")
	private String jogo;

	@OneToMany (mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List<Produto> produto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTituloCategoria() {
		return tituloCategoria;
	}

	public void setTituloCategoria(String tituloCategoria) {
		this.tituloCategoria = tituloCategoria;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public String getJogo() {
		return jogo;
	}

	public void setJogo(String jogo) {
		this.jogo = jogo;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
	
	
	
}
