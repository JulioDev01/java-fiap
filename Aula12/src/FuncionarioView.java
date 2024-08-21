import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class FuncionarioView {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Juca", 5700);

        int meses = Integer.parseInt(JOptionPane.showInputDialog("Quantos meses você trabalhou?"));


        try {
            System.out.println(funcionario.calcularPlr(true, meses));
        } catch (NumberFormatException e){
            System.err.println("Digite numeros");
        } catch (Exception e ) {
            System.err.println((e.getMessage()));
        }finally {
            System.out.println("Processo finalizado");
        }




        int ferias = Integer.parseInt(JOptionPane.showInputDialog("Digite os dias de Ferias"));

        try {
            System.out.println(funcionario.calcularFerias(ferias));
        }catch
        (NumberFormatException e) {
            System.err.println("Digite numeros");
        }catch (Exception e ){
            System.err.println(e.getMessage());
        }finally {
            System.out.println("Processo finalizado");
        }
    }
}