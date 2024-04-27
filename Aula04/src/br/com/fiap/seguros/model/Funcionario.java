package br.com.fiap.seguros.model;

public class Funcionario {
    private String nome;
    private long matricula;
    private Profissao profissao;
    private double salario;

    public Funcionario(){};

    public Funcionario(long matricula){
        this.matricula = matricula;
    };

    public Funcionario(long matricula, String nome){
        this(matricula);
        this.nome = nome;
    };

    public Funcionario(long matricula, String nome, Profissao profissao, double salario){
        this(matricula, nome);
        this.profissao = profissao;
        this.salario = salario;
    };

    public String exibirDados(){
        return "Marcel: " + nome
                + " " + matricula
                + " " + profissao.getNome()
                + " " + salario;
    }

    //getter e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
