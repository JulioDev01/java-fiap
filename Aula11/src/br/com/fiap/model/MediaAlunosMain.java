package br.com.fiap.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MediaAlunosMain {
    public static void main(String[] args) {

        List<Aluno> alunos = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);
        String resposta;

        do {
            //Ler as informações do aluno
            System.out.println("Informe o nome do aluno: ");
            String nome = leitor.nextLine();
            System.out.println("Informe a idade do aluno: ");
            int idade = leitor.nextInt();
            System.out.println("Informe o rm do aluno: ");
            String rm = leitor.nextLine() + leitor.next();
            System.out.println("Informe a nota1 do aluno: ");
            double nota1 = leitor.nextDouble();
            System.out.println("Informe a nota2 do aluno: ");
            double nota2 = leitor.nextDouble();
            leitor.nextLine();

            Aluno aluno = new Aluno(nome, rm, idade, nota1, nota2);
            alunos.add(aluno);

            //Perguntar se quer adicionar mais
            System.out.println("Deseja adicionar mais algum aluno? (s/n)");
            resposta = leitor.nextLine();

        } while (resposta.equalsIgnoreCase("s"));
        leitor.close();

        System.out.println("Lista alunos: ");
        double somaMediaGeral = 0;
        int somaIdadeGeral = 0;
        int maiorIdade = 0;
        int menorIdade = 0;

        //Exibir lista de alunos
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
            somaMediaGeral += aluno.calcularMedia();
            somaIdadeGeral += aluno.getIdade();
            if (aluno.getIdade() > maiorIdade){
                maiorIdade = aluno.getIdade();
            }
            if (aluno.getIdade() < menorIdade){
                menorIdade = aluno.getIdade();
            }
        }

        //Total de alunos cadastrados
        System.out.println("Quantidade de alunos: " + alunos.size());
        //Média geral de notas
        System.out.println("Média Geral: " + somaMediaGeral);
        //Média geral de idade
        System.out.println("Média Geral: " + somaIdadeGeral);
        //Maior Idade
        System.out.println("Maior Idade: " + maiorIdade);
        //Menor Idade
        System.out.println("Menor Idade: " + menorIdade);

    }

}
