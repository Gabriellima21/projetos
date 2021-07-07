
public class TestaContaSemCriarCliente {	
	
	public static void main(String[] args) {
		
	 Conta ContaDaVera = new Conta (); 
	 ContaDaVera.Titular = new Cliente ();
	 
	 ContaDaVera.Titular.Nome = "Vera Lucia"; 
	 ContaDaVera.Titular.CPF = "123.123.123-30";
	 ContaDaVera.Saldo = 200; 
	 
	 System.out.println(ContaDaVera.Saldo);
	}
	
}
