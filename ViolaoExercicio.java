package com.mycompany.escolamusica;

public class ViolaoExercicio extends InstrumentoMusical {
    private int numeroDeCordas;

    public ViolaoExercicio(String material, String madeira, int numeroDeCordas) {
        super("Violão", material);
        this.numeroDeCordas = numeroDeCordas;
    }

    @Override
    public void afinar() {
        System.out.println("Afinando o violão com " + numeroDeCordas + " cordas, feito de " + material + "...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando o violão com " + numeroDeCordas + " cordas...");
    }

    public int getNumeroDeCordas() {
        return numeroDeCordas;
    }

    public void setNumeroDeCordas(int numeroDeCordas) {
        this.numeroDeCordas = numeroDeCordas;
    }
}
