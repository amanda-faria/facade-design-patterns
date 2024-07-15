package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CantorTest {

    @Test
    void deveRetornarNaoHaMusicaDesseCAntorEmIngles() {
        Cantor cantor = new Cantor();
        Ingles.getInstancia().addMusicaQueNaoEstaNoIdioma(cantor);

        assertEquals(false, cantor.analisar());
    }

    @Test
    void deveRetornarHaMusicaDesseCAntorEmPortugues() {
        Cantor cantor = new Cantor();
        Portugues.getInstancia().addMusicaQueNaoEstaNoIdioma(cantor);

        assertEquals(true, cantor.analisar());
    }

    @Test
    void deveRetornarNaoHaMusicaDesseCAntorEmEspanhol() {
        Cantor cantor = new Cantor();
        Espanhol.getInstancia().addMusicaQueNaoEstaNoIdioma(cantor);

        assertEquals(false, cantor.analisar());
    }

    @Test
    void deveRetornarCantorSemPendenciaParaAnalisar() {
        Cantor cantor = new Cantor();

        assertEquals(true, cantor.analisar());
    }


}