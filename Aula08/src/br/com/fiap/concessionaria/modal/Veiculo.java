package br.com.fiap.concessionaria.modal;

public class Veiculo {
    private String modelo;
    private int quantLugares;
    private double comprimento;
    private int anoFabricacao;
    private Cor cor;

    public Veiculo(String modelo, int quantLugares, double comprimento, int anoFabricacao, Cor cor) {
        this.modelo = modelo;
        this.quantLugares = quantLugares;
        this.comprimento = comprimento;
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
    }




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

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }
}
