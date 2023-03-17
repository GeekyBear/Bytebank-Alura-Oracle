// Entidad cuenta
public abstract class Cuenta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	public Cuenta(int agencia) {
		if(agencia <= 0) {
			System.out.println("No se permite 0");
			this.agencia = 1;
		} else {
			this.agencia = agencia;
		}
		
	}
	
	public abstract void depositar(double valor);
	
	public boolean retirar (double valor){
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
	}
	public boolean transferir (double valor, Cuenta cuenta){
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			cuenta.saldo += valor;
			return true;
		} 
		
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setAgencia(int agencia) {
		if(agencia > 0) {
			this.agencia = agencia;
		} else {
			System.out.println("No estan permitidos los valores negativos");
		}
	}
	
	public int getAgencia() {
		return agencia;
	}

	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
}

