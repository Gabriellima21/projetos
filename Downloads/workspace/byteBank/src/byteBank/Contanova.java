package byteBank;

public class Contanova {
	int Agencia;
	String Titular;
	double Saldo;
	int Numero; 
	
	public void Deposito (double valor) {
		if (Saldo >= valor) 
			this.Saldo -= valor;
	}
		
	public boolean Saque (double valor) {	
		if (Saldo >= valor) {
			this.Saldo -= valor;
			return true;
		}else {
			return false; 
		}
	} 
	public boolean Transfere (double valor, Conta Destino) {
		if (Saldo >= valor) {
			this.Saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
		
		
		
		
		
	
	

}
