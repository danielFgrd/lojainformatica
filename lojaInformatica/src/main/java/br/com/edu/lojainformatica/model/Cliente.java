package br.com.edu.lojainformatica.model;

import javax.persistence.*;

import org.hibernate.annotations.Generated;

@Entity 
@Table (name="tbCliente")
public class Cliente {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_clientes;
	private String nome;
	private String endereco;
	private String email;
	
	@Column (name= "idCliente")
	public Integer getId_clientes() {
		return id_clientes;
	}
	public void setId_clientes(Integer id_clientes) {
		this.id_clientes = id_clientes;
	}
	
	@Column (name= "cliNome")
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Column (name="cliEndereco")
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	@Column (name="cliEmail")	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
