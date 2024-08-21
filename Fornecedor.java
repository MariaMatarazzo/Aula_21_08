package Aula_21_08;

public class Fornecedor {
	int id;
	String razaoSocial;
	String cnpj;
	String endereco;
	String telefone;
	String email;
	String inscricaoEstadual;


	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setrazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getcnpj() {
		return cnpj;
	}
	public void setcnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getendereco() {
		return endereco;
	}
	public void setendereco(String endereco) {
		this.endereco = endereco;
	}
	public String gettelefone() {
		return telefone;
	}
	public void settelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public String getinscricaoEstadual() {
		return inscricaoEstadual;
	}
	public void setinscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public String Entregar() {
		return "Entregar";
	}
	public String Agenda() {
		return "Agendar";
	}
	public String venda() {
		return "vender";
	}




}

