import br.com.fiap.ensino.model.Bacharelado;
import br.com.fiap.ensino.model.Medio;
import br.com.fiap.ensino.model.Tecnologo;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String formacao = JOptionPane.showInputDialog(null,
                "Qual formação deseja cadastrar (BACHALERADO, TECNOLOGO OU MEDIO)? ");

        if (formacao.toUpperCase().equalsIgnoreCase("BACHALERADO")){
            Bacharelado engSof = new Bacharelado("Engenharia de Software", 5,
                    1400, 60, 40, "GS");
            JOptionPane.showMessageDialog(null, engSof);
        } else if (formacao.toUpperCase().equalsIgnoreCase("TECNOLOGO")){
            Tecnologo ads = new Tecnologo("ADS", 5,
                    1800, 24,true);
            JOptionPane.showMessageDialog(null, ads);
        } else if (formacao.toUpperCase().equalsIgnoreCase("MEDIO")) {
            Medio bradesco = new Medio("Ensino Medio", 2, 2000,
                    36, "Tecnico");
            JOptionPane.showMessageDialog(null, bradesco);
        } else {
            JOptionPane.showMessageDialog(null,"Informe um curso válido.");
        }

    }
}