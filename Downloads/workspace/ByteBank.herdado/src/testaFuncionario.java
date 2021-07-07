
public class testaFuncionario {

	public static void main(String[] args) {
	
		Funcionario Gabriel = new Gerente ();
		
		Gabriel.setNome("Gabriel Lima"); 
		
		Gabriel.setCPF("123.123.123-85");
		
		Gabriel.setSalario(2600.00);
		
		System.out.println(Gabriel.getNome());
		
		System.out.println("A sua bonificação é " + Gabriel.getBonificacao());

		
	}

}
