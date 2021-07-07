package br.com.caelum.leilao.serviço;

public class GeradorPagamentos {
	

	    private final RepositorioDePagamentos pagamentos;
	    private final RepositorioDeLeiloes leiloes;
	    private final Avaliador avaliador;

	    public GeradorDePagamento(RepositorioDeLeiloes leiloes, 
	            RepositorioDePagamentos pagamentos, 
	            Avaliador avaliador) {
	        this.leiloes = leiloes;
	        this.pagamentos = pagamentos;
	        this.avaliador = avaliador;
	    }

	    public void gera() {

	        List<Leilao> leiloesEncerrados = leiloes.encerrados();
	        for(Leilao leilao : leiloesEncerrados) {
	            avaliador.avalia(leilao);

	            Pagamento novoPagamento = 
	                    new Pagamento(avaliador.getMaiorLance(), Calendar.getInstance());
	            pagamentos.salva(novoPagamento);
	        }
	    }
	}
}
