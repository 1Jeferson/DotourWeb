package controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDAO;
import database.DatabaseConnection;
import model.Cliente;


@WebServlet("/CreateController")
public class CreateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cliente cliente = new Cliente();
		
		cliente.setUsuario(request.getParameter("usuario"));
		cliente.setEmail(request.getParameter("email"));
		cliente.setSenha(request.getParameter("senha"));
		cliente.setCpf(request.getParameter("cpf"));

		try {
			Connection connection = DatabaseConnection.createConnection();
			ClienteDAO clienteDAO = new ClienteDAO(connection);
			clienteDAO.createCliente(cliente);
			
			
			response.sendRedirect("ReadController");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
