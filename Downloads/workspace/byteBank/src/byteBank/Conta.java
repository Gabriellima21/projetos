package byteBank;


public class Conta {
	double Saldo;
	String Titular;
	int Agencia;
	int Numero;
	
 
	public void deposito(double valor) {
		
		this.Saldo = this.Saldo + valor;
	}
	

	    public boolean saca(double valor) { 
	        if(this.Saldo >= valor) {
	            this.Saldo = this.Saldo - valor;
	            return true;
	        } else { 
	            return false;
	        }
	    }
	
     public boolean Transfere (double valor, Conta Destino) {
    	 if (Saldo >= valor) {
    		 	this.Saldo -= valor; 
    		 	Destino.Saldo += valor;
    		 	return true;
    	 }else {
    		 return false;
    	 }
     }
}