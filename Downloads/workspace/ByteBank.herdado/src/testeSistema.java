
public class testeSistema {
    public static void main(String[] args) {
		

        private int senha = 2222;

        public void autentica(FuncionarioAutenticavel fa) {
            boolean autenticou = fa.autentica(this.senha);
            if(autenticou) {
                System.out.println("Pode entrar no sistema!");
            } else {
                System.out.println("N�o pode entrar no sistema!");
            }
        }

 }

}