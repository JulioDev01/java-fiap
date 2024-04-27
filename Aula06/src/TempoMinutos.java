import javax.swing.*;

public class TempoMinutos {
    public static void main(String[] args) {
        String tempo = JOptionPane.showInputDialog("Informe o tempo no formato (hh:mm): ");

        //Forma 1 : calcula os minutos do tempo (01:10 --> 70 minutos)
//        char horas1 = tempo.charAt(0);
//        char horas2 = tempo.charAt(1);
//        char min1 = tempo.charAt(3);
//        char min2 = tempo.charAt(4);
//
//        int horas = Integer.parseInt(String.valueOf(horas1) + String.valueOf(horas2));
//        int min = Integer.parseInt(String.valueOf(min1) + String.valueOf(min2));
//
//        int tempoMinutos = (horas * 60) + min;
//
//        JOptionPane.showMessageDialog(null, "Total em minutos: " + tempoMinutos);

        //Forma 2 : permite os padrôes (1:11 ou 01:10)

        int posicaoDoisPontos = tempo.indexOf(":");
        String horasString = tempo.substring(0,posicaoDoisPontos);
        String minutosString = tempo.substring(posicaoDoisPontos + 1);

        int horas = Integer.parseInt(horasString);
        int min = Integer.parseInt(minutosString);

        int total = (horas * 60) + min;

        JOptionPane.showMessageDialog(null, "Total em minutos: " + total);


    }
}
