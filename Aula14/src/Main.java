import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //Criar um objeto que representa uma pasta
        File pasta = new File("churros");

        //Se a pasta não existir, criar a pasta
        if (!pasta.exists()){
            pasta.mkdir();
            System.out.println("Pasta criada!");
        }

        //Criar um arquivo dentro da pasta churros
        File churros = new File(pasta, "doce.txt");
        if(!churros.exists()){
            try {
                churros.createNewFile();
                System.out.println("Arquivo criado!");
            } catch (IOException e){
                throw new RuntimeException(e);
            }
        }
    }
}