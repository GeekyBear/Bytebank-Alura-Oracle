
public class SistemaInterno {
	private String clave = "12345";
	
	public boolean autentica(Autenticable persona) {
		boolean puedeIniciarSesion = persona.iniciarSesion("MiClave");
		if(puedeIniciarSesion) {
			System.out.println("Login exitoso");
			return true;
		}else {
			System.out.println("Error en login");
			return false;
		}		
	}
}
