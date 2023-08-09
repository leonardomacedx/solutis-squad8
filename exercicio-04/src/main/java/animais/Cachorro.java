package main.java.animais;

import main.java.classabs.AnimalTerrestreAB;

public class Cachorro extends AnimalTerrestreAB {

    @Override
    public void comer() {
        quantidadeComida += 3;
    }

    @Override
    public void moverse() {
        quantidadePercorrida += 2;
    }

    @Override
    public void dormir() {
        quantidadeDormida += 2;
    }
}
