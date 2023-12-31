package main.java.exercicio04_OOavancado.animais;

import main.java.exercicio04_OOavancado.classabs.AnimalVoadorAB;

public class Pombo extends AnimalVoadorAB {

    @Override
    public void comer() {
        quantidadeComida += 1;
    }

    @Override
    public void moverse() {
        quantidadePercorrida+= 2;
    }

    @Override
    public void dormir() {
        quantidadePercorrida+= 1;
    }

    @Override
    public void voar() {
        quantidadePercorrida += 5;
    }
}
