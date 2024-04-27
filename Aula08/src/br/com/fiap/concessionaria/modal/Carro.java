package br.com.fiap.concessionaria.modal;

public class Carro extends Veiculo {
    private int quantPortas;
    private String placa;
    private float motor = 1;


    public Carro(String modelo, int quantLugares, double comprimento, int anoFabricacao, Cor cor, int quantPortas, String placa, float motor) {
        super(modelo, quantLugares, comprimento, anoFabricacao, cor);
        this.quantPortas = quantPortas;
        this.placa = placa;
        this.motor = motor;
    }

    public int getQuantPortas() {
        return quantPortas;
    }

    public void setQuantPortas(int quantPortas) {
        this.quantPortas = quantPortas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public float getMotor() {
        return motor;
    }

    public void setMotor(float motor) {
        this.motor = motor;
    }
}
