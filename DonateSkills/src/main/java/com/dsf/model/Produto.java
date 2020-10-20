package com.dsf.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull
	@Size(max = 70)
	private String nome;

	@NotNull
	private String descricao;
	
	@NotNull
	private String nivel;

	@NotNull
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	@NotNull
	@ManyToOne
	@JsonIgnoreProperties("cursoCriado")
	private Usuario criador;
	
	public long getid() {
		return id;
	}

	public void setid(long id) {
		this.id = id;
	}

	public String getnome() {
		return nome;
	}

	public void setnome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Usuario getCriador() {
		return criador;
	}

	public void setCriador(Usuario criador) {
		this.criador = criador;
	}
}