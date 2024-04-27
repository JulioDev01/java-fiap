import br.com.fiap.concessionaria.modal.Carro;
import br.com.fiap.concessionaria.modal.Cor;
import br.com.fiap.concessionaria.modal.Veiculo;

public class Main {
    public static void main(String[] args) {
        Cor roxo = new Cor(120, 0, 55, "roxo");

        Carro corsa = new Carro("Corsa", 4, 4.2,
                1990, roxo, 2, "ZZZ-1234", 1);

        System.out.println("Modelo: " + corsa.getModelo() +
                " ,Lugares: " + corsa.getQuantLugares() +
                " ,Ano: " + corsa.getAnoFabricacao() +
                " ,Cor " + corsa.getCor().getNome());

    }
}