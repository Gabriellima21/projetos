
public class Gerente extends Funcionario {

	private int Senha;
	
	
	public boolean autentica (int Senha) {
		 if (this.Senha == Senha) {
			 return true;  
		 } else {
			 return false; 
		 }
		
	}
	
	public int getSenha() {
		return Senha;
	}

	public void setSenha(int senha) {
		Senha = senha;
	} 
	
	public double getBonificacao() {
		return (super.getBonificacao())
+ super.getSalario();
}
 	
}
