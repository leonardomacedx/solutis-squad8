package main.java.exercicio04_OOavancado.animais;

import main.java.exercicio04_OOavancado.classabs.AnimalTerrestreAB;

public class Gato extends AnimalTerrestreAB {

    @Override
    public void comer() {
        quantidadeComida += 2;
    }

    @Override
    public void moverse() {
        quantidadePercorrida += 5;
    }

    @Override
    public void dormir() {
        quantidadeDormida += 3;
    }
}
