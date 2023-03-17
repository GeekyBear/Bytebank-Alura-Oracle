
public class TestGerente {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setSalario(6000);
		gerente.setNombre("Ezequiel Sanchez");
		gerente.setTipo(1);
		gerente.setClave("MiClave");
		
		System.out.println(gerente.getBonificacion());
		System.out.println(gerente.iniciarSesion("MiClave"));
	}
}
