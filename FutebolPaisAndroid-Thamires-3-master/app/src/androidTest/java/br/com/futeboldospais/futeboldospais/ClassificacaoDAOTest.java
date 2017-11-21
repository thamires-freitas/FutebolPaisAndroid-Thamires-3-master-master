package br.com.futeboldospais.futeboldospais;

import junit.framework.TestCase;

import org.junit.Before;

import br.com.futeboldospais.futeboldospais.model.Classificacao;

/**
 * Created by Thamires on 10/11/2017.
 */

// Na classificaçao , buscamos no banco de dados as equipes que foram classificadas para os
    // proximos jogos

public class ClassificacaoDAOTest classificacaoDAO {

    ClassificacaoDAO classificacaoDAO;
    Classificacao equipe1, equipe2, equipe3;

    @Before
    public void beforeTest() {

        equipe1 = new Equipe();
        equipe1.setSaldoGols(1);
        equipe1.setVitorias(1);
        equipe1.setJogos(1);
        equipe1.setDerrotas(1);

        equipe2 = new Equipe();
        equipe2.setSaldoGols(1);
        equipe2.setVitorias(1);
        equipe2.setJogos(1);
        equipe2.setDerrotas(1);

        equipe3 = new Equipe();
        equipe3.setSaldoGols(1);
        equipe3.setVitorias(1);
        equipe3.setJogos(1);
        equipe3.setDerrotas(1);




        List<Classificacao> listaClassificacao = new List<Classificacao>();
        listaClassificacao.add(equipe1);
        listaClassificacao.add(equipe2);
        listaClassificacao.add(equipe3);

        SQLiteDatabase bancoDados = getDataBase();
    }
}

    @Test
    public void testeBuscaClassificacao() {
        equipe1.inserirDados(bancoDados, listaClassificacao);
        Classificacao[] equipeRetrieve = listarDadosPorRodadaETurno(getContext(),1,1);
        List<Classificacao> listaClassificacaoRetrieve = Arrays.asList(classificacaoRetrieve);
        assertEquals("Nao classificado",listaClassificacao,listaJogosRetrieve);

    }

}