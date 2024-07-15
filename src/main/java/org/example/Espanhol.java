package org.example;

public class Espanhol extends Idioma {
    private static Espanhol espanhol = new Espanhol();

    private Espanhol() {};

    public static Espanhol getInstancia() {
        return espanhol;
    }
}
