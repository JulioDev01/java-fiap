package br.com.fiap.tds.model;

public class Carro {

    //Atributos encapsulados
    private String placa;
    private String cor;
    private String modelo;
    private float motor = 1;
    private int quantLugares;
    private int quantPortas;
    private int anoFabricacao;
    private double comprimento;


    //Métodos Getters e Setters
    //No IntelliJ IDEA: ALT + INSERT (Getters e Setters)
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo() {
        return modelo;
    }





    public void setAno(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    public int getAno() {
        return anoFabricacao;
    }




    public void setMotor(float motor) {
        this.motor = motor;
    }
    public float getMotor(){
        return motor;
    }





    public void setCor(String cor){
        this.cor = cor;
    }

    public String getCor(){
        return cor;
    }





    public void setPlaca(String placa){
        this.placa = placa;
    }

    public String getPlaca(){
        return placa;
    }




    public void setQuantLugares(int quantLugares){
        this.quantLugares = quantLugares;
    }
    public int getQuantLugares(){
        return quantLugares;
    }



    public void setQuantPortas(int quantPortas){
        this.quantPortas = quantPortas;
    }

    public int getQuantPortas(){
        return quantPortas;
    }



    public void setComprimento(double comprimento){
        this.comprimento = comprimento;
    }
    public double getComprimento(){
        return comprimento;
    }




}
