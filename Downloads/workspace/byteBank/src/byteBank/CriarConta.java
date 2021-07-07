package byteBank;

public class CriarConta {
 public static void main(String[] args) {
	 
	 Conta primeiraConta = new Conta();
	
	 primeiraConta.Saldo = 200; 
	
	 System.out.println("O saldo da primeira conta é " + primeiraConta.Saldo);
	
	 Conta segundaConta = new Conta(); 
	
	 segundaConta.Saldo = 50;
	
	 System.out.println("O saldo da segunda conta é " + segundaConta.Saldo);
	 
	 System.out.println("O número da Agência da primeria Conta é " + primeiraConta.Agencia);
	 
	 System.out.println("O número da Agência da segunda Conta é " + segundaConta.Agencia);
  }
 
}
