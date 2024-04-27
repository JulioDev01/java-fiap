package br.com.fiap.seguros.model;

public class Profissao {
    private String nome;

    public Profissao(){};

    public Profissao(String nome){
        this.nome = nome;
    }

    //getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
