package br.com.fiap.ensino.model;

//Classe abstrata -> não pode ser instanciada e pode conter métodos abstratos
public abstract class Formacao {

    protected String descricao;
    private int periodo;
    private double mensalidade;
    protected int duracao;

    public Formacao(String descricao, int periodo, double mensalidade, int duracao) {
        this.descricao = descricao;
        this.periodo = periodo;
        this.mensalidade = mensalidade;
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Descrição: " + descricao +
                "\nPeríodo: " + periodo +
                "\nMensalidade: " + mensalidade +
                "\nDuração: " + duracao;
    }


    public double calcularMensalidade(double fator){
        return getDuracao() * fator * 500;
    }

    //Método abstrato, sem implementação
    public abstract void definirDuracao();

    public double calcularMedia(double global1, double global2){
        return (global1 * 0.4) + (global2 * 0.6);
    }

    public double calcularMedia(double cp1, double global1, double challenge1,
                                double global2, double cp2, double challenge2){
        double semestre1 = global1 * 0.6 + cp1 * 0.2 + challenge1 * 0.2;
        double semestre2 = global2 * 0.6 + cp2 * 0.2 + challenge2 * 0.2;
        return semestre1 * 0.4 + semestre2 * 0.6;
    }

    public double calcularMedia(double cp1, double cp2, double cp3){
        double media = 0;
        if (cp1 >= cp2 && cp3 >= cp2) {
            media = (cp1 + cp3) /2;
        } else if (cp1 >= cp3 && cp2 >= cp3) {
            media = (cp1 + cp2) /2;
        } else {
            media = (cp2 + cp3) /2;
        }
        return media;
    }



    //getters e setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
