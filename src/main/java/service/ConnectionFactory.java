package service;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	//Establishes database connection
	public Connection getConnection() {
		String url = "jdbc:mysql://127.0.0.1:3306/coviddb?useTimezone=true&amp&serverTimezone=UTC";
		String user = "root";
		String password = "root";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			throw new RuntimeException("Connection error: " + e);
		}
	}
}
