package br.edu.com.lojainformatica.persistence;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteJdbcDAO {
	
	private Connection conn;

	public ClienteJdbcDAO(Connection conn) {
		this.conn = conn;		
		
	}
	
}
