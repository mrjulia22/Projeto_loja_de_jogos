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
@Table(name = "tb_categorias")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "O modelo do playstation é obrigatório")
	@Size(min = 5, max = 100, message = "O atributo título deve conter no minimo 5 e no máximo 100 caracteres")
	private String playStation;

	@NotBlank(message = "O modelo do nintendo é obrigatório")
	@Size(min = 5, max = 100, message = "O atributo título deve conter no minimo 5 e no máximo 100 caracteres")
	private String nintendo;

	@NotBlank(message = "O modelo do xbox é obrigatório")
	@Size(min = 5, max = 100, message = "O atributo título deve conter no minimo 5 e no máximo 100 caracteres")
	private String xBox;

	@NotBlank(message = "O modelo do fliperama é obrigatório")
	@Size(min = 5, max = 100, message = "O atributo título deve conter no minimo 5 e no máximo 100 caracteres")
	private String fliperama;

	@NotBlank(message = "O do PCgamer é obrigatório")
	@Size(min = 5, max = 100, message = "O atributo título deve conter no minimo 5 e no máximo 100 caracteres")
	private String pcGamer;

	@NotBlank(message = "O título do jogo é obrigatório")
	@Size(min = 5, max = 100, message = "O atributo título deve conter no minimo 5 e no máximo 100 caracteres")
	private String jogos;

	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")

	private List<Produto> produto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlayStation() {
		return playStation;
	}

	public void setPlayStation(String playStation) {
		this.playStation = playStation;
	}

	public String getNintendo() {
		return nintendo;
	}

	public void setNintendo(String nintendo) {
		this.nintendo = nintendo;
	}

	public String getxBox() {
		return xBox;
	}

	public void setxBox(String xBox) {
		this.xBox = xBox;
	}

	public String getFliperama() {
		return fliperama;
	}

	public void setFliperama(String fliperama) {
		this.fliperama = fliperama;
	}

	public String getPcGamer() {
		return pcGamer;
	}

	public void setPcGamer(String pcGamer) {
		this.pcGamer = pcGamer;
	}

	public String getJogos() {
		return jogos;
	}

	public void setJogos(String jogos) {
		this.jogos = jogos;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

}
