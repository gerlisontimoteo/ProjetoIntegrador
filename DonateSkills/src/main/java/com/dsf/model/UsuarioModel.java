package com.dsf.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "usuario")
public class UsuarioModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_usuario;
	
	@Column
	@NotNull
	@Size(max = 70)
	private String nome;
	
	@Column
	@NotNull
	@Size(max = 70)
	private String email;
	
	@Column
	@NotNull
	@Size(min = 8, max = 70)
	private String senha;
	
	@Column
	@NotNull
	private int pontuacao;
	
	@Column
	@NotNull
	@Size(max = 70)
	private int curso_estudado;
	
	@Column
	@NotNull
	@Size(max = 70)
	private int curso_monitorado;
	
	@Column
	@NotNull
	@Size(max = 70)
	private int curso_criado;

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

	public int getCurso_estudado() {
		return curso_estudado;
	}

	public void setCurso_estudado(int curso_estudado) {
		this.curso_estudado = curso_estudado;
	}

	public int getCurso_monitorado() {
		return curso_monitorado;
	}

	public void setCurso_monitorado(int curso_monitorado) {
		this.curso_monitorado = curso_monitorado;
	}

	public int getCurso_criado() {
		return curso_criado;
	}

	public void setCurso_criado(int curso_criado) {
		this.curso_criado = curso_criado;
	}
}