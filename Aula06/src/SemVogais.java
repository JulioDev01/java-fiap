import javax.swing.*;

public class SemVogais {
    public static void main(String[] args) {
        //Modificando vogais para *
        String texto2 = JOptionPane.showInputDialog("Informe um texto: ");

        for (int i = 0; i < texto2.length(); i++) {
            char caractere = texto2.charAt(i);

            if ("aeiouAEIOU".indexOf(caractere) != -1){
                texto2 = texto2.replace(caractere, '*');
            }
        }

        JOptionPane.showMessageDialog(null, texto2);
    }
}
