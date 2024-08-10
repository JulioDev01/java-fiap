import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {

        List<String> compras = new ArrayList();
        compras.add("Arroz");
        compras.add("Feijão");

        //Exibir a quantidade de elementos da lista
        System.out.println(compras.size());

        //Remover o feijão da lista
        compras.remove("Feijão");

        //Validar se o Macarrão está na Lista
        System.out.println("Tem macarrão? " + compras.contains("Macarrão"));

        //Criar um array(vetor) da lista
        System.out.println(Arrays.toString(compras.toArray()));

        //Adicionar o Macarrão na primeira posição da lista
        compras.add(0, "Macarrão");

        //Exibir o item da lista de compra que está na posição 0
        System.out.println(compras.get(0));

        //Apagar toda lista
        compras.clear();

        //Adicionar os itens Playstation, Xbox, TV, Nintendo
        compras.add("Playstation");
        compras.add("Xbox");
        compras.add("TV");
        compras.add("Nintendo");

        //Substituir o item da posição 0 por Chocolate
        compras.set(0, "Chocolate");

        //Achar o posição do primeiro Chocolate
        compras.indexOf("Chocolate");

        //Criar uma sublista dos dois primeiros itens da lista
        List<String> sublista = compras.subList(0, 2);

        //Percorrer a lista
        for(String item : compras){
            System.out.println(item);
        }



    }
}