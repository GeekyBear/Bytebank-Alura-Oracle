
public class CuentaCorriente extends Cuenta {
	public CuentaCorriente(int agencia) {
		super(agencia);
	}
	
	@Override
	public boolean retirar(double valor) {
		double comision = 0.2;
		return super.retirar(valor + comision);
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		
	}
}
