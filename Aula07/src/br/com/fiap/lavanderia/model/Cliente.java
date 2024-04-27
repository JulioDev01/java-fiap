package br.com.fiap.lavanderia.model;

public class Cliente extends Pessoa {

    private boolean assinante;

    public void pagar(double valor){
        //Se for assinante tem 10% de desconto
        if (assinante)
            valor *= 0.9;
        //Exibir o nome e o valor a ser pago
        System.out.println(nome + " valor a ser pago: " + valor);
    }

    public Cliente(int id, String nome, String cpf, Endereco endereco, boolean assinante){
        super(id, nome, cpf, endereco);
        this.assinante = assinante;
    }

    //Getters e Setters
    public boolean isAssinante() {
        return assinante;
    }

    public void setAssinante(boolean assinante) {
        this.assinante = assinante;
    }
}