package br.edu.com.lojainformatica.persistence;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class JdbcUtil {
	
	private static String connectionDriverClass = "com.mysql.jdbc.Driver";
	
	private static String connectionUrl = "jdbc:mysql://192.168.33.151:3306/lojainfo";
	
	private static String connectionUserName = "root";
	private static String connectionPassword = "admin123";
	
	private static Connection conn;
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException{
		if(JdbcUtil.conn != null) {
		}
	}
	
	
	
	public JdbcUtil() {
		
	}
}