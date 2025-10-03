package com.mycompany.escolamusica;

public class BateriaExercicio extends InstrumentoMusical {
    private int numeroDePecas;

    public BateriaExercicio(String material, int numeroDePecas) {
        super("Bateria", material);
        this.numeroDePecas = numeroDePecas;
    }

    @Override
    public void afinar() {
        System.out.println("Afinando a bateria com " + numeroDePecas + " peças, feita de " + material + "...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando a bateria com " + numeroDePecas + " peças...");
    }

    public int getNumeroDePecas() {
        return numeroDePecas;
    }

    public void setNumeroDePecas(int numeroDePecas) {
        this.numeroDePecas = numeroDePecas;
    }
}
