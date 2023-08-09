package main.java.exercicio04_OOavancado.animais;

import main.java.exercicio04_OOavancado.classabs.AnimalTerrestreAB;

public class Elefante extends AnimalTerrestreAB {

    @Override
    public void comer() {
        quantidadeComida += 4;
    }

    @Override
    public void moverse() {
        quantidadePercorrida += 1;
    }

    @Override
    public void dormir() {
        quantidadeDormida += 3;
    }
}
