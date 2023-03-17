
public class TestReferencias {
	public static void main(String[] args) {
		Funcionario funcionario = new Contador();
		funcionario.setNombre("Eze");
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Alondra");
		
		funcionario.setSalario(2000);
		gerente.setSalario(10000);
	}
}
