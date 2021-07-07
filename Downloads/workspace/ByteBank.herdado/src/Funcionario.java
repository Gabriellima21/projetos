
public abstract class Funcionario {
	
	private String Nome;
	private String CPF; 
	private double Salario;
	
	//CONSTRUTOR 
	public Funcionario () {
		
	}
	
	public double getBonificacao() {
		return this.Salario * 0.10;
	
	}
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public double getSalario() {
		return Salario;
	}
	public void setSalario(double salario) {
		Salario = salario;
	} 
	
	

}
