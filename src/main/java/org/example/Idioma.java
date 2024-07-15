package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Idioma {

    private List<Cantor> musicaNoIdioma = new ArrayList<Cantor>();

    public void addMusicaQueNaoEstaNoIdioma(Cantor cantor) {
        this.musicaNoIdioma.add(cantor);
    }

    public boolean verificarCantorPossuiMusicaNesseIdioma(Cantor cantor) {
        return this.musicaNoIdioma.contains(cantor);
    }
}
