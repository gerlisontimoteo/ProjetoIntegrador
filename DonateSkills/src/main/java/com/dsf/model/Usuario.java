package com.dsf.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(max = 70)
	private String nome;
	
	@NotNull
	@Size(max = 70)
	private String email;
	
	@NotNull
	@Size(min = 8, max = 70)
	private String senha;
	
	@OneToMany(mappedBy = ("criador"), cascade = CascadeType.ALL)
	@JsonIgnoreProperties("criador")
	private List<Produto> cursoCriado;

	public long getid() {
		return id;
	}

	public void setid(long id) {
		this.id = id;
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

	public List<Produto> getcursoCriado() {
		return cursoCriado;
	}

	public void setcursoCriado(List<Produto> cursoCriado) {
		this.cursoCriado = cursoCriado;
	}
}