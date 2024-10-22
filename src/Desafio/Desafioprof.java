package Desafio;

import java.util.Scanner;

public class Desafioprof {
    public static void main(String[] args) {
        System.out.println("-------------------DesafioProf!!!!-------------------");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de usuarios que deseja cadastrar:");
        int qtdusuarios = scanner.nextInt();
        scanner.nextLine();
        String[] cabecalho = {"Id","Nome","Telefone","email"};
        String[][] matrizCadastro = new String[qtdusuarios+1][4];
        matrizCadastro[0] = cabecalho;

        System.out.println("Preencha os dados a seguir:");
        for (int linhas = 1; linhas < matrizCadastro.length; linhas++) {
            System.out.println("Id:");
            matrizCadastro[linhas][0] = scanner.nextLine();

            System.out.println("Nome:");
            matrizCadastro[linhas][1] = scanner.nextLine();

            System.out.println("Telefone:");
            matrizCadastro[linhas][2] = scanner.nextLine();

            System.out.println("E-mail:");
            matrizCadastro[linhas][3] = scanner.nextLine();

        }
        for (int linhas = 0; linhas < matrizCadastro.length; linhas++) {
            System.out.println(matrizCadastro[linhas][0]+"\t"+matrizCadastro[linhas][1]+"\t\t\t"+matrizCadastro[linhas][2]+"\t\t\t"+matrizCadastro[linhas][3]);

        }


    }
}
