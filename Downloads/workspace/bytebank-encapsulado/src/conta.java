
public class conta {
	
	private double Saldo;
	private int Agencia;
	private int Numero;
	private cliente Titular;
	
 
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
	
     public boolean Transfere (double valor, conta Destino) {
    	 if (Saldo >= valor) {
    		 	this.Saldo -= valor; 
    		 	Destino.Saldo += valor;
    		 	return true;
    	 }else {
    		 return false;
    	 }
     }
    public double getSaldo() {
    	 return this.Saldo; 
     }
    public int getNumero () {
    	return this.Numero;
    }
    public void setNumero (int Numero) {
    	this.Numero = Numero;
    }
    public int getAgencia () {
    	return this.Agencia;
    }
    public void setAgencia (int Agencia) {
    	this.Agencia = Agencia;
    }

	public cliente getTitular() {
	return Titular;
}
    public void setTitular(cliente Titular) {
		this.Titular = Titular;
	
  } 
}

