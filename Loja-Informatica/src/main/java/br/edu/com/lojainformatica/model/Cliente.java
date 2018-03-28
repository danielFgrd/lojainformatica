package br.edu.com.lojainformatica.model;

public class Cliente {
	private Integer id_clientes;
	private String nome;
	private String endereco;
	private String email;
	
	
	public Integer getId_clientes() {
		return id_clientes;
	}
	public void setId_clientes(Integer id_clientes) {
		this.id_clientes = id_clientes;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
