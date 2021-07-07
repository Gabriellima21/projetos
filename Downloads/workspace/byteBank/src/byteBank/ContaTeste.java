package byteBank;

public class ContaTeste {
	public static void main(String[] args) {
		Conta ContaVera = new Conta ();
		
		Conta ContaGabriel = new Conta ();
		ContaGabriel.Saldo = 100;
		ContaGabriel.deposito(20);
		System.out.println("O seu saldo da sua conta é de " + ContaGabriel.Saldo);
		
		ContaGabriel.saca(50);
		System.out.println("O seu saldo da sua conta é de " + ContaGabriel.Saldo);
		
		
		ContaVera.Saldo = 200; 
		ContaGabriel.Transfere(50, ContaVera);
		System.out.println("O seu saldo da sua conta é de " + ContaVera.Saldo);
		
		ContaVera.Agencia
  }
	
}
