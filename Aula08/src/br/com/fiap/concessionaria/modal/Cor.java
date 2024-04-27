package br.com.fiap.concessionaria.modal;

public class Cor {
    private String nome;
    private int r, g, b;

    public Cor(int r, int g, int b, String nome){
        this.nome = nome;
        this.r = r;
        this.g = g;
        this.b = b;
    }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
