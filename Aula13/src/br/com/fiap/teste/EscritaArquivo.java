package br.com.fiap.teste;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscritaArquivo {
    public static void main(String[] args) {
        try{
            //Abrir o arquivo em modo escrita
            FileWriter outputStream = new FileWriter("exemplo.txt", true);
            PrintWriter arquivoSaida = new PrintWriter(outputStream);

            //Escrever no arquivo
            String conteudoArquivo = JOptionPane.showInputDialog("Informe o conteúdo do txt:");
            arquivoSaida.println(conteudoArquivo);

            //Fechar os recursos
            arquivoSaida.close();
            outputStream.close();

        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
