package br.com.fiap.banco.modal;

import javax.swing.*;

public class ContaCorrente extends ContaBancaria{
    private float taxaManutencao;
    private float limiteChequeEspecial;


    //Construtor que herda atributos da ContaBancaria


    public ContaCorrente(String numeroConta, float saldo, String nomeTitular, String numeroAgencia,
                         float taxaManutencao, float limiteChequeEspecial) {
        super(numeroConta, saldo, nomeTitular, numeroAgencia);
        this.taxaManutencao = taxaManutencao;
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    //Metodo para aplicar a taxa de manutenção
    public void aplicarTaxaManutencao(){
        if (getSaldo() >= taxaManutencao){
            setSaldo(getSaldo() - taxaManutencao);
            JOptionPane.showMessageDialog(null, "Taxa de manutenção de " +
                    "R$" + taxaManutencao + " aplicada com sucesso.");
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente para cobrar a taxa de manutenção.");
        }
    }

    //Metodo para verificar o limite do cheque especial
    public void verificarLimiteChequeEspecial(){
        JOptionPane.showMessageDialog(null, "O limite do cheque especial é de R$" +
                limiteChequeEspecial + ".");
    }




    //Getters e Setters
    public float getTaxaManutencao() {
        return taxaManutencao;
    }

    public void setTaxaManutencao(float taxaManutencao) {
        this.taxaManutencao = taxaManutencao;
    }

    public float getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(float limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
}
