package br.com.fiap.exercicio.model;

public class ContaCorrente {
    private double saldo;
    private double limite;

    public void sacar(double valor) throws Exception {
        if (valor < 0) {
            throw new Exception("Valor inválido, precisa ser maior que zero");
        }
        if (valor > saldo){
            throw new Exception("Você não tem saldo suficiente");
        }
        saldo -= valor;
    }

    public void depositar(double valor) throws Exception {
        if(valor < 0){
            throw new Exception("Valor inválido, precisa ser maior que zero");
        }
        saldo += valor;
    }

    public ContaCorrente(){}

    public ContaCorrente(double saldo, double limite) {
        if (saldo < 0)
            throw new RuntimeException("Saldo não pode ser negativo");
        this.saldo = saldo;
        if (limite < 0)
            throw new RuntimeException("Limite não pode ser negativo");
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        if (limite < 0)
            throw new RuntimeException("Valor inválido, precisa ser maior do que zero");
        this.limite = limite;
    }
}
