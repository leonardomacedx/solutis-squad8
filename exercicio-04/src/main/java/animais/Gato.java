package main.java.animais;

import main.java.classabs.AnimalAB;
import main.java.classabs.AnimalTerrestreAB;

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
