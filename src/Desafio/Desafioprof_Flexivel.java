package Desafio;

import java.util.Scanner;

public class Desafioprof_Flexivel {
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
            for (int colunas = 0; colunas < cabecalho.length; colunas++) {
                System.out.println(cabecalho[colunas]+": ");
                matrizCadastro[linhas][colunas] = scanner.nextLine();

            }

        }
        String tabela ="";
        for (int linhas = 0; linhas < matrizCadastro.length; linhas++) {
            for (int colunas = 0; colunas < cabecalho.length; colunas++) {
                tabela += matrizCadastro[linhas][colunas];
                tabela += colunas==0 ? "\t" : "\t\t\t";
            }
            tabela += "\n";

        }

        System.out.println(tabela);


    }
}
