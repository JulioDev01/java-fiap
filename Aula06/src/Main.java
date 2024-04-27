import javax.swing.*;
import static com.sun.tools.javac.util.StringUtils.toUpperCase;


public class Main {
    public static void main(String[] args) {

        //Verificando strings guais
        String churros1 = "Chocolate";
        String churros2 = "chocolate";

        if (churros1.equalsIgnoreCase(churros2)) {
            JOptionPane.showMessageDialog(null, "Churros Iguais");
        } else {
            JOptionPane.showMessageDialog(null, "Churros Diferentes");
        }


        //Imprimindo todo texto em maiusculo
        String texto1 = JOptionPane.showInputDialog("Informe uma palavra: ");
        JOptionPane.showMessageDialog(null, texto1.toUpperCase());



    }
}