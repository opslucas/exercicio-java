package testes;

import dominio.*;
import org.junit.Assert;
import org.junit.Test;

public class TesteDoAvaliador {
    
    @Test
    public void deveEntenderLancesEmOrdemCrescente() {
        //Cen�rio
        Usuario joao = new Usuario("Joao");
        Usuario jose = new Usuario("Jose");
        Usuario maria = new Usuario("Maria");
        
        Leilao leilao = new Leilao("Playstation 4");
        
        leilao.propoe(new Lance(joao, 250.0));
        leilao.propoe(new Lance(jose, 300.0));
        leilao.propoe(new Lance(maria, 400.0));
        
        //A��o
        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);
        
        //Valida��o
        double maiorEsperado = 400;
        double menorEsperado = 250;
        
        Assert.assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.00001);
        Assert.assertEquals(menorEsperado, leiloeiro.getMenorLance(), 0.00001);
    }
} 