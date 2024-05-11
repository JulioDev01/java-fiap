package br.com.fiap.ensino.model;

public class Medio extends Formacao{
    private String tipo;

    public Medio(String descricao, int periodo, double mensalidade, int duracao, String tipo) {
        super(descricao, periodo, mensalidade, duracao);
        this.tipo = tipo;
    }


    @Override
    public String toString() {
        return super.toString() + "\nTipo:" + tipo;
    }

    public double calcularMensalidade(double fator){
        return 36 * fator * 600;
    }

    //get e set
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
