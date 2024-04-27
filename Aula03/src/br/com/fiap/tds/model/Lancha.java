package br.com.fiap.tds.model;

public class Lancha {
    private String modelo;
    private int quantLugares;
    private int anoFabricacao;
    private int quantMotores;
    private double comprimento;
    private Cor cor;


    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }



    public int getQuantLugares() {
        return quantLugares;
    }
    public void setQuantLugares(int quantLugares) {
        this.quantLugares = quantLugares;
    }



    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }



    public int getQuantMotores() {
        return quantMotores;
    }
    public void setQuantMotores(int quantMotores) {
        this.quantMotores = quantMotores;
    }



    public double getComprimento() {
        return comprimento;
    }
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }



    public Cor getCor() {
        return cor;
    }
    public void setCor(Cor cor) {
        this.cor = cor;
    }
}
