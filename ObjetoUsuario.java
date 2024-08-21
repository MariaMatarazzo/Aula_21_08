package Aula_21_08;
public class ObjetoUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Usuario usuario = new Usuario ();

	usuario.setNome("Marca: Apple");
	usuario.setUsuario("Velocidade da CPU:3,5 GHz a 4,0 GHz");
	usuario.setId(9876);
	usuario.setsenha(12000);
	usuario.setpermissao("12000");
	
		
		
		System.out.println(usuario.getNome());
		System.out.println(usuario.getUsuario());
		System.out.println(usuario.getId());
		System.out.println(usuario.getsenha());
		System.out.println(usuario.getPermissao());
		
		System.out.println(usuario.cadastrar());
		System.out.println(usuario.mudanca());
		System.out.println(usuario.logOut());

	}

}
