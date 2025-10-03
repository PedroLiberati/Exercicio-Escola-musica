package com.mycompany.escolamusica;

public abstract class InstrumentoMusical {
    protected String nome;
    protected String material;

    public InstrumentoMusical(String nome, String material) {
        this.nome = nome;
        this.material = material;
    }

    public abstract void afinar();

    public abstract void tocar();

    public String getNome() {
        return nome;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "Instrumento: " + nome + ", Material: " + material;
    }
}
