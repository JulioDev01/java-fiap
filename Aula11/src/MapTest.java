import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        //Criar um mapeamento de veiculos, chave é a placa do veículo, valor é o modelo do carro
        Map<String, String> veiculos = new HashMap<>();

        //Adicionar 3 veículos no mapeamento
        veiculos.put("124342", "Kicks");
        veiculos.put("466311", "Kwid");
        veiculos.put("547222", "Civic");

        //Recuperar modelo do veículo pela placa
        System.out.println(veiculos.get("466311"));

        //Exibir todos os veiculos no formato: placa - modelo


        for (String chave : veiculos.keySet()){
            String carro = veiculos.get(chave);
            System.out.println("Chave: " + chave + ", Valor: " + carro);
        }
    }
}
