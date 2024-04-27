import br.com.fiap.lavanderia.model.Endereco;
import br.com.fiap.lavanderia.model.Funcionario;
import br.com.fiap.lavanderia.model.Pessoa;

public class Main {

    public static void main(String[] args) {

        //Instaciar Endereco
        Endereco endereco = new Endereco();

        //Instanciar um funcionário
        Funcionario f = new Funcionario(1, "Julio",
                "443741132", endereco, "Assistente", 1200);

        //Setar o nome e cargo do funcionario
        f.setNome("Jorge Roberto");
        f.setCargo("Assistente técnico");

    }
}