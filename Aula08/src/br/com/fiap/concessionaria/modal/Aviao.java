package br.com.fiap.concessionaria.modal;

public class Aviao extends Veiculo{

    private String prefixo;
    private int quantTurbinas;


    public Aviao(String modelo, int quantLugares, double comprimento, int anoFabricacao, Cor cor, String prefixo, int quantTurbinas) {
        super(modelo, quantLugares, comprimento, anoFabricacao, cor);
        this.prefixo = prefixo;
        this.quantTurbinas = quantTurbinas;
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public int getQuantTurbinas() {
        return quantTurbinas;
    }

    public void setQuantTurbinas(int quantTurbinas) {
        this.quantTurbinas = quantTurbinas;
    }
}
