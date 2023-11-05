package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	private static final String URL = "jdbc:mysql://localhost:3306/dotourweb";
	private static final String USER = "root";
	private static final String PASSWORD = "root";

	public static Connection createConnection() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Encontrado!");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}

		try {

			Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Conectado!");
			return connection;

		} catch (SQLException e) {

			System.out.println(e.getMessage());
			return null;
		}

	}

}