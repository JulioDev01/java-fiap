package br.com.fiap.ensino.model;

public class Tecnologo extends Formacao{
    private boolean planoEstendido;

    public Tecnologo(String descricao, int periodo, double mensalidade, int duracao, boolean planoEstendido) {
        super(descricao, periodo, mensalidade, duracao);
        this.planoEstendido = planoEstendido;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPlano Estendido:" + planoEstendido;
    }


    public double calcularMensalidade(double fator){
        return getDuracao() * fator * 500;
    }

    @Override
    public void definirDuracao() {
        duracao = 24;
    }

    //get e set
    public boolean isPlanoEstendido() {
        return planoEstendido;
    }

    public void setPlanoEstendido(boolean planoEstendido) {
        this.planoEstendido = planoEstendido;
    }
}
