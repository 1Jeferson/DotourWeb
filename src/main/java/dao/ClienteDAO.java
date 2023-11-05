package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.DatabaseConnection;
import model.Cliente;

public class ClienteDAO {

	private static String sql;
	private final Connection connection;

	public ClienteDAO() throws SQLException {
		connection = DatabaseConnection.createConnection();
	}

	public ClienteDAO(Connection connection) {
		this.connection = connection;
	}

	public void closeConnection() {
		try {
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void createCliente(Cliente cliente) {
		sql = "INSERT INTO cliente (usuario, email, senha, cpf) VALUES (?,?,?,?)";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setString(1, cliente.getUsuario());
			stmt.setString(2, cliente.getEmail());
			stmt.setString(3, cliente.getSenha());
			stmt.setString(4, cliente.getCpf());

			stmt.executeUpdate();
			System.out.println("Cadastrado com sucesso.\n");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Cliente findCliente(int id) {
		Cliente cliente = null;
		sql = "SELECT * FROM cliente WHERE id=?";

		try (PreparedStatement stmt = connection.prepareStatement(sql)) {

			stmt.setInt(1, id);
			ResultSet result = stmt.executeQuery();

			if (result.next()) {
				cliente = new Cliente();
				cliente.setId(result.getInt("id"));
				cliente.setUsuario(result.getString("usuario"));
				cliente.setEmail(result.getString("email"));
				cliente.setSenha(result.getString("senha"));
				cliente.setCpf(result.getString("cpf"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return cliente;
	}

	public List<Cliente> findCliente() {
		sql = "SELECT * FROM cliente";

		List<Cliente> clientes = new ArrayList<Cliente>();

		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			ResultSet result = stmt.executeQuery();

			while (result.next()) {
				Cliente cliente = new Cliente();
				cliente.setId(result.getInt("id"));
				cliente.setUsuario(result.getString("usuario"));
				cliente.setEmail(result.getString("email"));
				cliente.setSenha(result.getString("senha"));
				cliente.setCpf(result.getString("cpf"));

				clientes.add(cliente);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return clientes;
	}

	public void updateCliente(Cliente cliente) {
		sql = "UPDATE cliente SET usuario = ?,email = ?, senha = ? WHERE id = ?";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setString(1, cliente.getUsuario());
			stmt.setString(2, cliente.getEmail());
			stmt.setString(3, cliente.getSenha());
			stmt.setInt(4, cliente.getId());

			stmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteCliente(int id) {
		sql = "DELETE FROM cliente WHERE id = ?";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setInt(1, id);

			stmt.executeUpdate();
			System.out.println("Dados deletados.\n");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}