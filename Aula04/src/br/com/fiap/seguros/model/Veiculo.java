package br.com.fiap.seguros.model;

public class Veiculo {
    private String placa;
    private String modelo;
    private String cor;
    private double motor;

    //Construtor com todos atributos
    public Veiculo(String placa, String modelo, String cor, double motor){
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
        this.motor = motor;
    }

    //Construtor Padrão
    public Veiculo(){}





    //Getters e Setters
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }




    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }




    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }




    public double getMotor() {
        return motor;
    }
    public void setMotor(double motor) {
        this.motor = motor;
    }
}
