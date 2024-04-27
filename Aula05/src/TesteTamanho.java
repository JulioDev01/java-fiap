import javax.swing.*;

public class TesteTamanho {
    public static void main(String[] args) {
        //Peça o nome, altura e peso de 2 pessoas e retorne a mais pesada e a mais alta

        String nome1 = JOptionPane.showInputDialog("Informe o nome da primeira pessoa: ");
        float altura1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura (m): "));
        float peso1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso (kg): "));

        String nome2 = JOptionPane.showInputDialog("Informe o nome da segunda pessoa: ");
        float altura2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura (m): "));
        float peso2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso (kg): "));

        if (altura1 > altura2){
            JOptionPane.showMessageDialog(null, nome1+ " é o maior.");
        } else if (altura2 > altura1){
            JOptionPane.showMessageDialog(null, nome2+ " é o maior.");
        } else {
            JOptionPane.showMessageDialog(null, "Mesmo tamanho!");
        }

        if (peso1 > peso2){
            JOptionPane.showMessageDialog(null, nome1+ " é o mais pesado.");
        } else if (peso2 > peso1){
            JOptionPane.showMessageDialog(null, nome2+ " é o mais pesado.");
        } else {
            JOptionPane.showMessageDialog(null, "Mesmo peso!");
        }

    }
}
