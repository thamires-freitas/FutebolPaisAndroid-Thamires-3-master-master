package br.com.futeboldospais.futeboldospais;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import br.com.futeboldospais.futeboldospais.model.Artilharia;


/**
 * Created by Thamires on 10/11/2017.
 */

// esta classe testa os dados da artilharia e os dados do artilheiro. Resulta as informaçoes do
    // artilheiro dentro da classe de artilharia


public class ArtilhariaTest extends TestCase {

    private Artilharia artilheiro1;

    @Before
    public void beforeTest(){
        artilheiro1 = new Artilharia();
        artilheiro1.setNome("Marcelo");
        artilheiro1.setCartoesAmarelos(2);
        artilheiro1.setCategoria("Master");
        artilheiro1.setGols(25);


    }

    @Test
    public void testePreencheBean() {
        assertEquals("Nome","Marcelo",artilheiro1.getNome());
        assertEquals("Gols",25,artilheiro1.getGols());
    }

}
