import br.com.fiap.seguros.model.Cliente;
import br.com.fiap.seguros.model.Veiculo;
import br.com.fiap.seguros.model.Funcionario;
import br.com.fiap.seguros.model.Profissao;

public class Main {
    public static void main(String[] args) {

        //Instanciar Veiculos
        Veiculo corsa = new Veiculo("ZZZ1234", "Ford-Ka", "Prata", 1.6);


        //Instanciar Cliente
        Cliente joao = new Cliente("João", "443.741.168-42");
        Cliente pedro = new Cliente("Pedro", corsa, "336.223.774-89");
        Profissao medico = new Profissao("Médico Pediatra");
        Funcionario marcel = new Funcionario(554466, "Marcel", profissao, 1400);


        //Exibir os dados
        System.out.println("João: " + joao.getNome()
                + " " + joao.getCpf());

        System.out.println("Pedro: " + pedro.getNome()
                + " " + pedro.getVeiculo()
                + " " + pedro.getCpf());

        System.out.println("Corsa: " + corsa.getPlaca()
                + " " + corsa.getMotor()
                + " " + corsa.getModelo()
                + " " + corsa.getCor());

        System.out.println("Profissão: " + medico.getNome());

        System.out.println(marcel.exibirDados());

    }
}