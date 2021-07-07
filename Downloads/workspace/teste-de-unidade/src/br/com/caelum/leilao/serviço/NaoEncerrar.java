package br.com.caelum.leilao.serviço;

import java.util.Calendar;

public class NaoEncerrar {

@Test
public void naoDeveEncerrarLeiloesQueComecaramMenosDeUmaSemanaAtras() {

    Calendar ontem = Calendar.getInstance();
    ontem.add(Calendar.DAY_OF_MONTH, -1);

    Leilao leilao1 = new CriadorDeLeilao().para("TV de plasma")
        .naData(ontem).constroi();
    Leilao leilao2 = new CriadorDeLeilao().para("Geladeira")
        .naData(ontem).constroi();

    RepositorioDeLeiloes daoFalso = mock(LeilaoDao.class);
    when(daoFalso.correntes()).thenReturn(Arrays.asList(leilao1, leilao2));

    EncerradorDeLeilao encerrador = new EncerradorDeLeilao(daoFalso);
    encerrador.encerra();

    assertEquals(0, encerrador.getTotalEncerrados());
    assertFalse(leilao1.isEncerrado());
    assertFalse(leilao2.isEncerrado());

    verify(daoFalso, never()).atualiza(leilao1);
    verify(daoFalso, never()).atualiza(leilao2);
}
}