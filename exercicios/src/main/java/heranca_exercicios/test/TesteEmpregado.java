package main.java.heranca_exercicios.test;

import main.java.heranca_exercicios.classes.Empregado;

public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("Alisson", "Quadra 23 Rua 10",
                "72985744756", 3, 1320.0, 9.0);

        double salario = empregado.calcularSalario();

        System.out.println("Nome do empregado: " + empregado.getNome());
        System.out.println("Salário: R$" + String.format("%.2f", salario));

        empregado.setSalarioBase(1500.0);
        double salarioAtualizado = empregado.calcularSalario();
        System.out.println("Salário atualizado: R$" + String.format("%.2f", salarioAtualizado));
    }
}
