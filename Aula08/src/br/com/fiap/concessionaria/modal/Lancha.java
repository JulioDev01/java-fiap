package br.com.fiap.concessionaria.modal;

public class Lancha extends Veiculo{
    private int quantMotores;


    public Lancha(String modelo, int quantLugares, double comprimento, int anoFabricacao, Cor cor, int quantMotores) {
        super(modelo, quantLugares, comprimento, anoFabricacao, cor);
        this.quantMotores = quantMotores;
    }

    public int getQuantMotores() {
        return quantMotores;
    }

    public void setQuantMotores(int quantMotores) {
        this.quantMotores = quantMotores;
    }
}
