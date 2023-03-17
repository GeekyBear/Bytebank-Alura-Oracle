
public class Gerente extends Funcionario implements Autenticable {
	private AutenticacionUtil util;
	
	public Gerente() {
		this.util = new AutenticacionUtil();
	}
	
	@Override
	public double getBonificacion() {
		return 2000;
	}

	@Override
	public void setClave(String clave) {
		this.util.setClave(clave);
	}
	
	@Override
	public boolean iniciarSesion(String clave) {
		return this.util.iniciarSesion(clave);
	}
	
}
