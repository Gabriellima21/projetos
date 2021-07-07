
public class FuncionarioAutentica extends Funcionario {
	
	  public double getBonificacao() {
          System.out.println("Chamando o método de bonificacao do GERENTE");
          return super.getSalario();
      }
}
	

