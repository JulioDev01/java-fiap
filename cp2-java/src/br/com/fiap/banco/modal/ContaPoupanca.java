package br.com.fiap.banco.modal;

import javax.swing.*;

public class ContaPoupanca extends ContaBancaria{
    private float taxaJurosMensal;


    //Construtor que herda atributos da ContaBancaria
    public ContaPoupanca(String numeroConta, float saldo, String nomeTitular, String numeroAgencia,
                         float taxaJurosMensal) {
        super(numeroConta, saldo, nomeTitular, numeroAgencia);
        this.taxaJurosMensal = taxaJurosMensal;
    }


    //Metodo que calcula rendimento mensal da conta
    public void calcularRendimento(){
        float rendimento = (taxaJurosMensal - 1)  * getSaldo();
        JOptionPane.showMessageDialog(null,"Rendimento mensal da poupança " +
                "é de R$" + rendimento);
    }



    //Getter e Setter
    public float getTaxaJurosMensal() {
        return taxaJurosMensal;
    }

    public void setTaxaJurosMensal(float taxaJurosMensal) {
        this.taxaJurosMensal = taxaJurosMensal;
    }
}
