package br.com.futeboldospais.futeboldospais;

import junit.framework.TestCase;

/**
 * Created by Thamires on 10/11/2017.
 */

// A classe de teste resultado testa a busca  ao banco de dados se o mesmo mostra as informaçoes
    // a respeito dos resultados de jogos de cada equipe.

public class ResultadoDAOTest resultadoDAO {

    ResultadoDAO resultadoDAO;
    Resultado equipe1, equipe2, equipe3;

    @Before
    public void beforeTest() {

        equipe1 = new Equipe();
        equipe1.setRodada(1);
        equipe1.setTurno(1);
        equipe1.setCategoria(1);
        equipe1.setArbitro(1);

        equipe2 = new Equipe();
        equipe2.setRodada(1);
        equipe2.setTurno(1);
        equipe2.setCategoria(1);
        equipe2.setArbitro(1);

        equipe3 = new Equipe();
        equipe3.setRodada(1);
        equipe3.setTurno(1);
        equipe3.setCategoria(1);
        equipe3.setArbitro(1);


        List<Resultado> listaResultado = new List<Resultado>();
        listaResultado.add(equipe1);
        listaResultado.add(equipe2);
        listaResultado.add(equipe3);


        SQLiteDatabase bancoDados = getDataBase();
    }
}

    @Test
    public void testeBuscaResultado() {
        equipe1.inserirDados(bancoDados, listaClassificacao);
        Resultado[] equipeRetrieve = listarDadosPorRodadaETurno(getContext(),1,1);
        List<Resultado> listaResultadoRetrieve = Arrays.asList(resultadoRetrieve);
        assertEquals("Resultado",listaResultado,listaResultadoRetrieve);

    }

}