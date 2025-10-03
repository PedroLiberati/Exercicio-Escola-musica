package com.mycompany.escolamusica;

public class PianoExercicio extends InstrumentoMusical {
    private int numeroDeTeclas;

    public PianoExercicio(String material, int numeroDeTeclas) {
        super("Piano", material);
        this.numeroDeTeclas = numeroDeTeclas;
    }

    @Override
    public void afinar() {
        System.out.println("Afinando o piano com " + numeroDeTeclas + " teclas, feito de " + material + "...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando o piano com " + numeroDeTeclas + " teclas...");
    }

    public int getNumeroDeTeclas() {
        return numeroDeTeclas;
    }

    public void setNumeroDeTeclas(int numeroDeTeclas) {
        this.numeroDeTeclas = numeroDeTeclas;
    }
}
