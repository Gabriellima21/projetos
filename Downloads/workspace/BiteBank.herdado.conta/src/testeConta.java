
public class testeConta {
	
	public static void main(String[] args) {
		
		contaCorrente cc = new contaCorrente (111, 111);
        cc.deposita(100.0);

        contaPoupanca cp = new contaPoupanca (222, 222);
        
        cp.deposita(200.0);

        cc. transfere(10.0, cp);
        
        
        
        System.out.println(cp.getSaldo());
        
        System.out.println(cc.getSaldo());
	}

}
