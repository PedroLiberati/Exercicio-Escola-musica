package com.mycompany.escolamusica;

public class EscolaMusica {
    public static void main(String[] args) {
        InstrumentoMusical violao = new ViolaoExercicio("Violão Clássico", "Madeira", 6);
        InstrumentoMusical saxofone = new SaxofoneExercicio("Yamaha", "Latão", 23);
        InstrumentoMusical piano = new PianoExercicio("Piano de Cauda", "Madeira", 88);

        violao.tocar();
        saxofone.tocar();
        piano.tocar();
    }
}
