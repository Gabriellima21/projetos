package byteBank;

public class CriarConta {
 public static void main(String[] args) {
	 
	 Conta primeiraConta = new Conta();
	
	 primeiraConta.Saldo = 200; 
	
	 System.out.println("O saldo da primeira conta � " + primeiraConta.Saldo);
	
	 Conta segundaConta = new Conta(); 
	
	 segundaConta.Saldo = 50;
	
	 System.out.println("O saldo da segunda conta � " + segundaConta.Saldo);
	 
	 System.out.println("O n�mero da Ag�ncia da primeria Conta � " + primeiraConta.Agencia);
	 
	 System.out.println("O n�mero da Ag�ncia da segunda Conta � " + segundaConta.Agencia);
  }
 
}
