
public class TestCuenta {
	public static void main(String[] args) {
		CuentaCorriente corriente  = new CuentaCorriente(1);
		CuentaAhorros ahorros = new CuentaAhorros(2);
		
		corriente.depositar(2000);
		corriente.transferir(1000, ahorros);
		
		System.out.println(corriente.getSaldo());
		System.out.println(ahorros.getSaldo());
	}
}
