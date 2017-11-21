package br.com.futeboldospais.futeboldospais;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import br.com.futeboldospais.futeboldospais.model.Cartao;

/**
 * Created by Thamires on 10/11/2017.
 */
public class CartaoTest extends TestCase {

    // Primeiro você vai declarar todos os seus objetos de teste.
    Cartao c1, c2, c3;

    // No método before, você precisa preencher os seus objetos de teste

    // a classe teste cartao mostra os jogadores que possuem cartao amarelo e qual equipe o jogador
    // faz parte.

    @Before
    public void beforeTest(){
        c1 = new Cartao();
        c1.setNumero(25);
        c1.setJogador("Antonio");
        c1.setEquipe("Master");
        c1.setArbitro("Joao");

        c2 = new Cartao();
        c2.setNumero(25);
        c2.setJogador("Antonio");
        c2.setEquipe("Master");
        c2.setArbitro("Pedro");

        c3 = new Cartao();
        c3.setNumero(25);
        c3.setJogador("Antonio");
        c3.setEquipe("Master");
        c3.setArbitro("Lucas");



    }

    // Nos métodos de teste, coloque apenas os asserts.
    // Lembre-se de que o seu dado de teste deve permitir "adivinhar" qual o dado que o método
    // deve retornar.

    @Test
    public void testeCartaoAmarelo() {
        assertEquals("Jogador","Antonio",c1.getJogador());
        assertEquals("Numero","25",c1.getNumero());
        assertEquals("Equipe","Master",c1.getEquipe());
        assertEquals("Arbitro","Pedro",c1.getArbitro());

    }
    // assertEquals("Mensagem de erro no JUnit", resultadoEsperado, metodoASerTestado(argumentos) );

    /* @Test
    public void testJogadoresCom3CartoesAmarelosNaoPodemJogar {
        assert
    } */
}
