package br.com.fiap.ensino.model;

public class Bacharelado extends Formacao{
    private String projetoConclusao;
    private int cargaHorariaEstagio;

    public Bacharelado(String descricao, int periodo, double mensalidade, int duracao, int cargaHorariaEstagio, String projetoConclusao) {
        super(descricao, periodo, mensalidade, duracao);
        this.cargaHorariaEstagio = cargaHorariaEstagio;
        this.projetoConclusao = projetoConclusao;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nProjeto Conclusao:" + projetoConclusao +
                "\nCarga Horaria Estagio:" + cargaHorariaEstagio;
    }


    public double calcularMensalidade(double fator){
        return (getDuracao() * fator * 600) + (cargaHorariaEstagio * 12);
    }

    @Override
    public void definirDuracao() {
        if (descricao.toLowerCase().contains("ENGENHARIA")){
            duracao = 60;
        } else {
            duracao = 48;
        }
    }

    //get e set
    public String getProjetoConclusao() {
        return projetoConclusao;
    }

    public void setProjetoConclusao(String projetoConclusao) {
        this.projetoConclusao = projetoConclusao;
    }

    public int getCargaHorariaEstagio() {
        return cargaHorariaEstagio;
    }

    public void setCargaHorariaEstagio(int cargaHorariaEstagio) {
        this.cargaHorariaEstagio = cargaHorariaEstagio;
    }
}
