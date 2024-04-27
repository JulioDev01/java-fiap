import br.com.fiap.tds.model.Carro;
import br.com.fiap.tds.model.Cor;
import br.com.fiap.tds.model.Aviao;
import br.com.fiap.tds.model.Lancha;
import br.com.fiap.tds.model.Elevador;

public class Main {
    public static void main(String[] args) {
        //Instanciar um Carro
        Carro gol = new Carro();

        gol.setCor("Azul");
        gol.setModelo("Gol");
        gol.setPlaca("ZZZ1231");
        gol.setAno(1999);
        gol.setQuantLugares(5);

        //Exibir os valores do carro
        System.out.println("Carro: " + gol.getModelo()
                + " " + gol.getCor()
                + " " + gol.getPlaca()
                + " " + gol.getQuantLugares()
                + " " + gol.getAno()
                + " " + gol.getMotor());






        //Instanciar uma Cor
        Cor azul = new Cor();

        azul.alterarCor(192,192,192, "Azul");

        //Exibir os valores da cor
        System.out.println("Cor: " + azul.getNome()
                + " " + azul.getR()
                + " " + azul.getG()
                + " " + azul.getB());







        //Instanciar um Avião
        Aviao jato = new Aviao();

        jato.setModelo("F400X");
        jato.setAnoFabricacao(2022);
        jato.setQuantTurbinas(2);
        jato.setCor(azul);

        //Exibir os valores do aviao
        System.out.println("Avião: " + jato.getModelo()
                + " " + jato.getAnoFabricacao()
                + " " + jato.getQuantTurbinas()
                + " " + jato.getCor().getNome());






        //Instanciar uma Lancha
        Lancha iate = new Lancha();

        iate.setModelo("800Gh");
        iate.setAnoFabricacao(2013);
        iate.setQuantMotores(1);
        iate.setCor(azul);

        //Exibir os valores da lancha
        System.out.println("Lancha: " + iate.getModelo()
                + " " + iate.getAnoFabricacao()
                + " " + iate.getQuantMotores()
                + " " + iate.getCor().getNome());




        //Instanciar Elevador
        Elevador fiap = new Elevador();

        fiap.inicializa(10,7);
        fiap.setAndarAtual(5);
        fiap.setPessoasPresentes(10);

        fiap.entra();
        fiap.desce();
        System.out.println("Elevador: " + fiap.getAndarAtual()
                + " " + fiap.getPessoasPresentes());
    }
}