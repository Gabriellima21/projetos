
public class testaGerente {
	
	public static void main(String[] args) {
	
	Gerente Vera = new Gerente();
	
	Vera.setNome("Vera Lucia");
	
	Vera.setCPF("123456987-85");
	
	Vera.setSalario(5000.00);
	
	System.out.println(Vera.getNome());
	System.out.println(Vera.getCPF());
	System.out.println(Vera.getBonificacao() );
	
	
	Vera.setSenha(222);
	
	boolean autenticou = Vera.autentica (222);
	
	System.out.println(autenticou);
}
	
}
