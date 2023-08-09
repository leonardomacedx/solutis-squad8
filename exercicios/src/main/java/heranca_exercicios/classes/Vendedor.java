package main.java.heranca_exercicios.classes;

public class Vendedor extends Empregado{

    private Double valorVendas;
    private Double comissao;

    public Vendedor(String nome, String endereco, String telefone, Integer codigoSetor,
                    Double salarioBase, Double imposto, Double valorVendas, Double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public Double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(Double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    @Override
    public Double calcularSalario() {
        double salario = super.calcularSalario();
        return salario + (valorVendas * (comissao/100));
    }
}
