package Aula_21_08;

public class ObjetoFornecedor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fornecedor fornecedor = new Fornecedor ();

		fornecedor.setId(8520);
		fornecedor.setrazaoSocial("Usuario:876543321");
		fornecedor.setcnpj("8765434");
		fornecedor.setemail("5286947");
		fornecedor.setendereco("Navegar");
		fornecedor.settelefone("Navegar");
		fornecedor.setinscricaoEstadual("Navegar");



		System.out.println(fornecedor.getRazaoSocial());
		System.out.println(fornecedor.getcnpj());
		System.out.println(fornecedor.getId());
		System.out.println(fornecedor.getemail());
		System.out.println(fornecedor.getendereco());
		System.out.println(fornecedor.gettelefone());
		System.out.println(fornecedor.getinscricaoEstadual());

		System.out.println(fornecedor.Entregar());
		System.out.println(fornecedor.venda());
		System.out.println(fornecedor.Agenda());




	}

}
