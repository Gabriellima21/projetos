
public class sistemaInterno extends Gerente {
	
	private int senha = 2222;

    public void autentica(FuncionarioAutentica fa) {
        boolean autenticou = fa.autentica (this.senha);
        if(autenticou) {
            System.out.println("Pode entrar no sistema!");
        } else {
            System.out.println("Não pode entrar no sistema!");
        }
    }
}
