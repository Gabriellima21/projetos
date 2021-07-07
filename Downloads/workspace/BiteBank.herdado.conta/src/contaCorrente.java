
public class contaCorrente extends conta {

	
	public contaCorrente (int Agencia, int Numero) {
		super (Agencia, Numero);
		
	}
	
	 @Override
     public boolean saca(double valor) {
         double valorASacar = valor + 0.2;
         return super.saca(valorASacar);
     }
	
}
