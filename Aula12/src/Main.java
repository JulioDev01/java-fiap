import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        try{
            //Ler um número
            int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número: "));
            System.out.println(num1);

            //Ler outro número
            int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe outro número: "));
            System.out.println(num2);

            //Dividir um número por outro
            System.out.println("A divisão do " + num1 + " com " +  num2 + " é: " + num1/num2);

        } catch (NumberFormatException e){
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Não é possível realizar divisão com zero!");
        } catch (Exception e){
            System.out.println("Tratando todos os erros!");
        } finally {
            System.out.println("Finalizando o programa!");
        }
    }
}