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
        return getDuracao() * fator * 600;
    }

    @Override
    public void definirDuracao() {
        duracao = 36;
    }

    //get e set
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
