package br.com.fiap.banco.modal;

import javax.swing.*;

public class ContaBancaria {
    private String numeroConta;
    private float saldo;
    private String nomeTitular;
    private String numeroAgencia;


    //Construtor
    public ContaBancaria(String numeroConta, float saldo, String nomeTitular, String numeroAgencia) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.nomeTitular = nomeTitular;
        this.numeroAgencia = numeroAgencia;
    }


    //Metodos para sacar o dinheiro da conta
    public void sacar(float valor){
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
            JOptionPane.showMessageDialog(null, "Saque de R$" + valor +
                    " realizado com sucesso.");
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente para realizar o saque.");
        }
    }

    //Método para depositar dinheiro na conta
    public void depositar(float valor){
        if (valor > 0){
            saldo += valor;
            JOptionPane.showMessageDialog(null, "Depósito de R$" + valor +
                    " realizado com sucesso.");
        } else {
            JOptionPane.showMessageDialog(null, "Deposite um valor válido.");
        }
    }

    //Metodo para verificar saldo da conta
    public void verificarSaldo(){
        JOptionPane.showMessageDialog(null, "Seu saldo é de R$" + saldo + ".");
    }




    //Getters e Setters
    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }
}
