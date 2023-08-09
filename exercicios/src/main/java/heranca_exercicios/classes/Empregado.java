package main.java.heranca_exercicios.classes;

public class Empregado extends Pessoa {

    private Integer codigoSetor;
    private Double salarioBase;
    private Double imposto;

    public Empregado(String nome, String endereco, String telefone, Integer codigoSetor,
                     Double salarioBase, Double imposto) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public Empregado() {
    }

    public Integer getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(Integer codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Double getImposto() {
        return imposto;
    }

    public void setImposto(Double imposto) {
        this.imposto = imposto;
    }

    public Double calcularSalario() {
        return salarioBase - (salarioBase * (imposto / 100));
    }
}
