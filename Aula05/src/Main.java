import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //ler duas notas e      converter a String em Float
        float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota"));
        float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota"));

        //exibir a média e se o aluno passou ou não
        float media = (nota1 + nota2) / 2;

        if (media >= 6){
            JOptionPane.showMessageDialog(null,"Aprovado, sua média é de: " + media);
        } else if (media >= 4 && media < 6){
            JOptionPane.showMessageDialog(null,"Ficou de Exame, sua média é de: " + media);
        } else {
            JOptionPane.showMessageDialog(null,"Ficou de DP, sua média é de: " + media);
        }


    }
}