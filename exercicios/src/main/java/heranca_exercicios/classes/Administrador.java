package main.java.heranca_exercicios.classes;

public class Administrador extends Empregado {

    private Double ajudaDeCusto;

    public Administrador(String nome, String endereco, String telefone, Integer codigoSetor,
                         Double salarioBase, Double imposto, Double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public Administrador() {

    }

    @Override
    public Double calcularSalario() {
        double salario = super.calcularSalario();
        return salario + ajudaDeCusto;
    }
}
