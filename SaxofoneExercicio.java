package com.mycompany.escolamusica;

public class SaxofoneExercicio extends InstrumentoMusical {
    private int numeroDeChaves;

    public SaxofoneExercicio(String material, int numeroDeChaves) {
        super("Saxofone", material);
        this.numeroDeChaves = numeroDeChaves;
    }

    @Override
    public void afinar() {
        System.out.println("Afinando o saxofone com " + numeroDeChaves + " chaves, feito de " + material + "...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando o saxofone com " + numeroDeChaves + " chaves...");
    }

    public int getNumeroDeChaves() {
        return numeroDeChaves;
    }

    public void setNumeroDeChaves(int numeroDeChaves) {
        this.numeroDeChaves = numeroDeChaves;
    }
}
