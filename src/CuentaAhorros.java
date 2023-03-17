
public class CuentaAhorros extends Cuenta {

	public CuentaAhorros(int agencia) {
		super(agencia);
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

}
