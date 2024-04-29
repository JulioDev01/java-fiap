package br.com.fiap.banco.modal;

import javax.swing.*;

public class ContaInvestimento {
    private String perfilInvestimento;
    private float taxaRentabilidade;
    private float valorInvestido;

    //Construtor
    public ContaInvestimento(String perfilInvestimento, float taxaRentabilidade,
                             float valorInvestido) {

        this.perfilInvestimento = perfilInvestimento;
        this.taxaRentabilidade = taxaRentabilidade;
        this.valorInvestido = valorInvestido;
    }



    //Metodos: investir, resgatarInvestimento, verificarTaxaRentabilidade
    //Método para investir o dinheiro
    public void investir(float valor){
        if (valor > 0){
            valorInvestido += valor;
            JOptionPane.showMessageDialog(null, "Investimento de R$" + valor + " realizado com sucesso.");
        } else{
            JOptionPane.showMessageDialog(null, "Deposite um valor válido.");
        }
    }

    //Método para resgatar o dinheiro
    public void resgatarDinheiro(float valor){
        if (valor > 0 && valor <= valor){
            valorInvestido -= valor;
            JOptionPane.showMessageDialog(null, "Resgate de R$" + valor + " realizado com sucesso.");
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente para realizar o resgate.");
        }
    }

    //Método para verificar a taxa de rentabilidade;
    public void verificarTaxaRentabilidade(){
        JOptionPane.showMessageDialog(null, "A taxa de entabilidade é de " + taxaRentabilidade +
                "% ao mês.");
    }




    //Getters e Setters
    public String getPerfilInvestimento() {
        return perfilInvestimento;
    }

    public void setPerfilInvestimento(String perfilInvestimento) {
        this.perfilInvestimento = perfilInvestimento;
    }

    public float getTaxaRentabilidade() {
        return taxaRentabilidade;
    }

    public void setTaxaRentabilidade(float taxaRentabilidade) {
        this.taxaRentabilidade = taxaRentabilidade;
    }

    public float getValorInvestido() {
        return valorInvestido;
    }

    public void setValorInvestido(float valorInvestido) {
        this.valorInvestido = valorInvestido;
    }
}
