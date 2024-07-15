package org.example;

public class CantorFacade {

    public static boolean verificarSePossuiMusicaNesseIdioma(Cantor cantor) {
        if (Ingles.getInstancia().verificarCantorPossuiMusicaNesseIdioma(cantor)) {
            return false;
        }
        if (Portugues.getInstancia().verificarCantorPossuiMusicaNesseIdioma(cantor)) {
            return true;
        }
        if (Espanhol.getInstancia().verificarCantorPossuiMusicaNesseIdioma(cantor)) {
            return false;
        }
        return true;
    }
}
