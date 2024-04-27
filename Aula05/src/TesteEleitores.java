import javax.swing.*;

public class TesteEleitores {
    public static void main(String[] args) {
        //ler a idade de 3 pessoas e informar sua classe eleitoral

        for (int i = 0; i < 3; i++){
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));

            if (idade < 16) {
                JOptionPane.showMessageDialog(null, "Não Eleitor!");
            } else if (idade >= 18 && idade <= 65){
                JOptionPane.showMessageDialog(null, "Eleitor!");
            } else {
                JOptionPane.showMessageDialog(null, "Eleitor Facultativo!");
            }
        }
    }
}
