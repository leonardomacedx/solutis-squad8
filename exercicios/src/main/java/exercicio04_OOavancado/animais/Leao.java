package main.java.exercicio04_OOavancado.animais;

import main.java.exercicio04_OOavancado.classabs.AnimalTerrestreAB;

public class Leao extends AnimalTerrestreAB {

    @Override
    public void comer() {
        quantidadeComida += 5;
    }

    @Override
    public void moverse() {
        quantidadePercorrida += 4;
    }

    @Override
    public void dormir() {
        quantidadeDormida += 2;
    }
}
