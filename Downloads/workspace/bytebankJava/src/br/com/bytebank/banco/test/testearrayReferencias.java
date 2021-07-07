package br.com.bytebank.banco.medelo.test;

public class testearrayReferencias {

	public static void main(String[] args) {
	
	Conta [] contas = new Conta[5];	
	
	 ContaCorrente cc1 = new ContaCorrente (22, 11); 
		 
		conta [0] = cc1;
		
	ContaPoupanca cc2 = new ContaPoupanca (11, 28);	
		
		conta [1] = cc2;  
	 
		System.out.println(conta[1].getNumero());
	 
		ContaPoupanca ref = (ContaCorrente)conta[1];
		
		System.out.println(cc2.getNumero());
		
	}

}
