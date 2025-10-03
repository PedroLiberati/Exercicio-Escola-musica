package com.mycompany.escolamusica;

public class EscolaMusica {
    public static void main(String[] args) {
        InstrumentoMusical[] banda = {
            new PianoExercicio("Piano de Cauda", "Madeira", 88),
            new ViolaoExercicio("Violão Clássico", "Madeira", 6),
            new SaxofoneExercicio("Saxofone Yamaha", "Latão", 23),
            new BateriaExercicio("Bateria Pearl", "Metal", 5)
        };

        System.out.println("== Apresentação da Orquestra ==\n");

        System.out.println("Afinando os instrumentos...");
        for (InstrumentoMusical instrumento : banda) {
            instrumento.afinar();
        }

        System.out.println("\nAgora vamos ouvir a execução:");
        for (InstrumentoMusical instrumento : banda) {
            instrumento.tocar();
        }
    }
}
