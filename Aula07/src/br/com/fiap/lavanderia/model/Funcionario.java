package br.com.fiap.lavanderia.model;

public class Funcionario extends Pessoa {

    private String cargo;
    private double salario;

    //O construtor da filha precisa chamar um construtor pai
    public Funcionario(int id, String nome, String cpf, Endereco endereco, String cargo, double salario){
        super(id, nome, cpf, endereco);
        this.cargo = cargo;
        this.salario = salario;
    }

    //Getters e Setters
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}