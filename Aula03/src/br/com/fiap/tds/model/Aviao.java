package br.com.fiap.tds.model;

public class Aviao {
    private String modelo;
    private String prefixo;
    private int quantLugares;
    private int anoFabricacao;
    private int quantTurbinas;
    private double comprimento;
    private Cor cor;

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }



    public String getPrefixo() {
        return prefixo;
    }
    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
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



    public int getQuantTurbinas() {
        return quantTurbinas;
    }
    public void setQuantTurbinas(int quantTurbinas) {
        this.quantTurbinas = quantTurbinas;
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
