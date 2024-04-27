package br.com.fiap.seguros.model;

public class Cliente {

    private String nome;
    private Veiculo veiculo;
    private String cpf;


    //Método Construtor: não tem retorno (nem void) e possui o msm nome da Classe
    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }


    public Cliente(String nome, Veiculo veiculo, String cpf){
        this(nome,cpf); //chamando o construtor que recebe nome, cpf
        this.cpf = cpf;
    }



    //Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }



    public Veiculo getVeiculo() {
        return veiculo;
    }
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }




    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
