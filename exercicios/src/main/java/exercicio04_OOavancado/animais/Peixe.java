package main.java.exercicio04_OOavancado.animais;

import main.java.exercicio04_OOavancado.classabs.AnimalMarinhoAB;

public class Peixe extends AnimalMarinhoAB {


    @Override
    public void comer() {
        quantidadeComida++;
    }

    @Override
    public void moverse() {
        quantidadePercorrida += 2;
    }

    @Override
    public void dormir() {
        quantidadeDormida++;
    }

    @Override
    public void nadar() {
        quantidadePercorrida += 6;
    }
}
