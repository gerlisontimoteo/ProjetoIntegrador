package com.dsf.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "usuario")
public class UsuarioModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_usuario;
	
	@NotNull
	@Size(max = 70)
	private String nome;
	
	@NotNull
	@Size(max = 70)
	private String email;
	
	@NotNull
	@Size(min = 8, max = 70)
	private String senha;
	
	@NotNull
	private int pontuacao;
	
	@OneToMany(mappedBy = ("criador"), cascade = CascadeType.ALL)
	@JsonIgnoreProperties("criador")
	private List<ProdutoModel> curso_criado;

	public long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

	public List<ProdutoModel> getCurso_criado() {
		return curso_criado;
	}

	public void setCurso_criado(List<ProdutoModel> curso_criado) {
		this.curso_criado = curso_criado;
	}
}