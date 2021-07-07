
public class TestaBanco {
public static void main(String[] args) {
	
		
		Cliente Gabriel = new Cliente (); 
			Gabriel.Nome = "Gabriel Lima"; 
			Gabriel.CPF  = "222.333.321-20";
			Gabriel.Profissão = "Programador"; 
			
	Conta ContaDoGabriel = new Conta ();
	ContaDoGabriel.deposito(20);
	
	ContaDoGabriel.Titular = Gabriel; 
	System.out.println(ContaDoGabriel.Titular.Nome);
				
	}
} 

