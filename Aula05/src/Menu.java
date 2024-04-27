import javax.swing.*;

public class Menu {
    public static void main(String[] args) {
        //Calculadora: digite dois numeros e escolha a opção 1-somar 2-subtrair 3-multiplicar 4-dividir

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        int operacao = Integer.parseInt(JOptionPane.showInputDialog("Escolha operação: 1)Somar; 2)Subtrair; 3)Dividir; 4)Multiplicar"));


        switch (operacao){
            case 1:
                JOptionPane.showMessageDialog(null, n1 + " + " + n2 + " = " + (n1 + n2));
                break;
            case 2:
                JOptionPane.showMessageDialog(null, n1 + " - " + n2 + " = " + (n1 - n2));
                break;
            case 3:
                JOptionPane.showMessageDialog(null,n1 + " / " + n2 + " = " + (n1 / n2));
                break;
            case 4:
                JOptionPane.showMessageDialog(null,n1 + " x " + n2 + " = " + (n1 * n2));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção Inválida");
        }
    }
}
