package main.java.classabs;

import main.java.interfaces.AnimalIF;

public abstract class AnimalAB implements AnimalIF {

    public double quantidadeComida;
    public double quantidadeDormida;
    public double quantidadePercorrida;
    public String nome;
    public String tipoAnimal;
    public int idade;
    public String habitat;
    public double altura;
    public double peso;

    @Override
    public abstract void comer();

    @Override
    public abstract void moverse();

    @Override
    public abstract void dormir();
}
