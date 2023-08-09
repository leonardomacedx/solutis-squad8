package main.java.exercicio04_OOavancado;

import main.java.exercicio04_OOavancado.animais.*;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Peixe peixe = new Peixe();
        Pombo pombo = new Pombo();
        Leao leao = new Leao();
        Elefante elefante = new Elefante();

        peixe.nadar();
        pombo.voar();
        cachorro.comer();
        gato.comer();
        leao.moverse();
        elefante.dormir();

        System.out.println(peixe.quantidadePercorrida);
        System.out.println(pombo.quantidadePercorrida);
        System.out.println(cachorro.quantidadeComida);
        System.out.println(gato.quantidadeComida);
        System.out.println(leao.quantidadePercorrida);
        System.out.println(elefante.quantidadeDormida);

    }

}
