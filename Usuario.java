package Aula_21_08;

public class Usuario {
	int id;
	String nome;
	int senha;
	String usuario;
	String permissao;

	public String getNome() {
		return nome;
	}
	public void setNome(String Nome) {
		this.nome = Nome;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String Usuario) {
		this.usuario = usuario;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getsenha() {
		return senha;
	}
	public void setsenha(int senha) {
		this.senha = senha;
	}
	public String getPermissao() {
		return permissao;
	}
	public void setpermissao(String Permissao) {
		this.permissao = permissao;
	}
	public String cadastrar() {
		return "cadastrar";
	}
	public String mudanca() {
		return "Mudar senha";
	}
	public String logOut() {
		return "LogOut";
	}




}


