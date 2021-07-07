
public class TestaGeteSet {

	public static void main(String[] args) {
		conta contaGabriel = new conta ();
		contaGabriel.setNumero(322);
		System.out.println(contaGabriel.getNumero());
		
		cliente Vera = new cliente ();
		
		Vera.setNome ("Vera Lucia");	
		
		 System.out.println(Vera.getNome());
		
	}
}  
