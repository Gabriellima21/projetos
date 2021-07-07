package br.com.caelum.leilao.serviço;

public class pagamento {
	public class Pagamento {

	    private double valor;
	    private Calendar data;

	    public Pagamento(double valor, Calendar data) {
	        this.valor = valor;
	        this.data = data;
	    }
	    public double getValor() {
	        return valor;
	    }
	    public Calendar getData() {
	        return data;
	    }
	}

	public interface RepositorioDePagamentos {
	    void salva(Pagamento pagamento);
	}
}
