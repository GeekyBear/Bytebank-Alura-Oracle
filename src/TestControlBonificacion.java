
public class TestControlBonificacion {
	public static void main(String[] args) {
		Funcionario eze = new Contador();
		eze.setSalario(2000);
		
		Gerente alondra  =new Gerente();
		alondra.setSalario(10000);
		
		Contador ines = new Contador();
		ines.setSalario(5000);
		
		ControlBonificacion controlBonificacion = new ControlBonificacion();
		
		controlBonificacion.registrarSalario(eze);
		controlBonificacion.registrarSalario(alondra);
		controlBonificacion.registrarSalario(ines);
	}
}
