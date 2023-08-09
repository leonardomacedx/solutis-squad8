package main.java.heranca_exercicios.test;

import main.java.heranca_exercicios.classes.Fornecedor;

public class TesteFornecedor {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("Leonardo", "QR 403 Conjunto 11 Casa 13",
                "61995568949", 69000.0, 58000.0);
        double saldo = fornecedor.obterSaldo();
        System.out.println("Nome: " + fornecedor.getNome());
        System.out.println("Endereço: " + fornecedor.getEndereco());
        System.out.println("Telefone: " + fornecedor.getTelefone());
        System.out.println("Valor de crédito: R$" + String.format("%.2f", fornecedor.getValorCredito()));
        System.out.println("Valor da dívida: R$" + String.format("%.2f", fornecedor.getValorDivida()));
        System.out.println("Saldo: R$" + String.format("%.2f", saldo));
    }
}
