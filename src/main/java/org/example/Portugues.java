package org.example;

public class Portugues extends Idioma{

    private static Portugues portugues = new Portugues();

    private Portugues() {};

    public static Portugues getInstancia() {
        return portugues;
    }
}