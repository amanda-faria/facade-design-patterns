package org.example;

public class Ingles extends Idioma{

    private static Ingles ingles = new Ingles();

    private Ingles() {};

    public static Ingles getInstancia() {
        return ingles;
    }
}