
public class FuncionarioAutentica extends Funcionario {
	
	  public double getBonificacao() {
          System.out.println("Chamando o m�todo de bonificacao do GERENTE");
          return super.getSalario();
      }
}
	

