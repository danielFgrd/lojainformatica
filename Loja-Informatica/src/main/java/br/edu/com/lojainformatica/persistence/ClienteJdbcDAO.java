package br.edu.com.lojainformatica.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.com.lojainformatica.model.Cliente;


public class ClienteJdbcDAO {
	
	private Connection conn;

	public ClienteJdbcDAO(Connection conn) {
		this.conn = conn;	
	}
	
	
	public void salvar(Cliente c) throws SQLException {
		String sql = "INSERT INTO tbClientes VALUES ('"+c.getNome()+"','"+c.getEndereco()+"','"+c.getEmail()+"');";
		System.out.println(sql);
		PreparedStatement preparedStatement = this.conn.prepareStatement(sql);
		preparedStatement.executeUpdate();
		preparedStatement.close();
	}
	
	public void alterar(Cliente c) throw SQLException {
		String sql= "UPTADE tbClientes set nome='"+c.getNome()+"',endereco = '"+c.getEndereco()+"', '"
	}
	
}
