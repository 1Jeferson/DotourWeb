package model;

public class Cliente {

	private int id;
	private String usuario;
	private String cpf;
	private String email;
	private String senha;

	public Cliente() {

	}

	public Cliente(int id, String usuario, String cpf, String email, String senha) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.cpf = cpf;
		this.email = email;
		this.senha = senha;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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

	
}