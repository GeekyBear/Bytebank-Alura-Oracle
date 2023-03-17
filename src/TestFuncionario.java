
public class TestFuncionario {
	public static void main(String[] args) {
		Funcionario eze = new Contador();
		eze.setNombre("Eze");
		eze.setDocumento("33213696");
		eze.setSalario(176000);
		eze.setTipo(0);
		
		System.out.println(eze.getSalario());
		System.out.println(eze.getBonificacion());
	}
}
