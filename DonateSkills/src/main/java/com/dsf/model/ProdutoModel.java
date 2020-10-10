package com.dsf.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produto")
public class ProdutoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_produto;

	@NotNull
	@Size(max = 70)
	private String nome_curso;

	@NotNull
	private String descricao;

	@NotNull
	private int custo_monitoria;

	@NotNull
	private int ganho_aula;

	@NotNull
	private int ganho_prova;

	@ManyToOne
	@JsonIgnoreProperties("produto")
	private CategoriaModel categoria;

	@ManyToOne
	@JsonIgnoreProperties("produto")
	private UsuarioModel criador;
	
	public long getId_produto() {
		return id_produto;
	}

	public void setId_produto(long id_produto) {
		this.id_produto = id_produto;
	}

	public String getNome_curso() {
		return nome_curso;
	}

	public void setNome_curso(String nome_curso) {
		this.nome_curso = nome_curso;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCusto_monitoria() {
		return custo_monitoria;
	}

	public void setCusto_monitoria(int custo_monitoria) {
		this.custo_monitoria = custo_monitoria;
	}

	public int getGanho_aula() {
		return ganho_aula;
	}

	public void setGanho_aula(int ganho_aula) {
		this.ganho_aula = ganho_aula;
	}

	public int getGanho_prova() {
		return ganho_prova;
	}

	public void setGanho_prova(int ganho_prova) {
		this.ganho_prova = ganho_prova;
	}

	public CategoriaModel getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaModel categoria) {
		this.categoria = categoria;
	}

	public UsuarioModel getCriador() {
		return criador;
	}

	public void setCriador(UsuarioModel criador) {
		this.criador = criador;
	}
}