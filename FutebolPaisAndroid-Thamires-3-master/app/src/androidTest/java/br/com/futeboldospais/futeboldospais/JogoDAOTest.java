package br.com.futeboldospais.futeboldospais;

import br.com.futeboldospais.futeboldospais.dao.JogoDAO;
import br.com.futeboldospais.futeboldospais.model.Jogo;

/**
 * Created by Thamires on 10/11/2017.
 */

// Na classe Jogo buscamos as rodadas dos jogos já jogados.

public class JogoDAOTest jogoDAO {

    JogoDAO jogoDAO;
    Jogo jogo1, jogo2, jogo3;

    @Before
    public void beforeTest() {
        jogo1 = new Jogo();
        jogo1.setTurno(1);
        jogo1.setRodada(1);
        jogo1.setEquipe(1);
        jogo1.setCategoria(1);

        jogo2 = new Jogo();
        jogo2.setTurno(1);
        jogo2.setRodada(1);
        jogo2.setEquipe(2);
        jogo2.setCategoria(2);

        jogo3 = new Jogo();
        jogo3.setTurno(1);
        jogo3.setRodada(1);
        jogo3.setEquipe(3);
        jogo3.setCategoria(3);

        List<Jogo> listaJogos = new List<Jogo>();
        listaJogos.add(jogo1);
        listaJogos.add(jogo2);
        listaJogos.add(jogo3);

        SQLiteDatabase bancoDados = getDataBase();
    }
}

    @Test
    public void testeBuscaJogo() {
        jogo1.inserirDados(bancoDados, listaJogos);
        Jogo[] jogosRetrieve = listarDadosPorRodadaETurno(getContext(),1,1);
        List<Jogo> listaJogosRetrieve = Arrays.asList(jogosRetrieve);
        assertEquals("Nao encontrado",listaJogos,listaJogosRetrieve);

    }

}