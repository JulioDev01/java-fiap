package br.com.fiap.exercicio.model;

import java.util.Scanner;
import java.util.Set;

public class ContaCorrenteView {
    public static void main(String[] args) {
        //Instaciar uma Conta Corrente
        ContaCorrente cc = new ContaCorrente(0,100);
        Scanner sc = new Scanner(System.in);

        try{
            //Pedir o valor para sacar
            System.out.println("Digite o valor para sacar: ");
            double valor = sc.nextDouble();
            cc.sacar(valor);
            System.out.println("Saldo atual: " + cc.getSaldo());
        } catch (Exception e){
            System.err.println(e.getMessage());
        }


        try{
            //Pedir o valor para alterar o limite
            System.out.println("Digite o valor para depositar: ");
            double valor = sc.nextDouble();
            cc.depositar(valor);
            System.out.println("Saldo atual: " + cc.getSaldo());
        } catch (Exception e){
            System.err.println(e.getMessage());
        }


        try{
            //Pedir o valor para alterar o limite
            System.out.println("Digite o valor para alterar o limite: ");
            double valor = sc.nextDouble();
            cc.setLimite(valor);
            System.out.println("Saldo atual: " + cc.getSaldo());
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
