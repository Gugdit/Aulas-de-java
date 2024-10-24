package Desafio;

import java.util.Scanner;

public class Desafio2prof_Flexivel {

    static String[][] matrizCadastro = {null};

    public static void main(String[] args) {

        System.out.println("-------------------DesafioProf!!!!-------------------");
        String[] cabecalho = {"Id","Nome","Telefone","Email"};

        matrizCadastro[0] = cabecalho;
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("\t1 - Para exibir as usuários cadastrados");
            System.out.println("\t2 - Para cadastrar um usuário");
            System.out.println("\t3 - Para atualizar um usuário");
            System.out.println("\t4 - Para deletar um usuário");
            System.out.println("\t5 - Para sair do programa");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    exibirCadastro(scanner);
                    break;
                case 2:
                    cadastrarUsuario(scanner);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Fim do programa");
                    scanner.close();
                    break;
            }
        }while (opcao!=5);

        scanner.close();
    }
    private static String [][] cadastrarUsuario(Scanner scanner){
        System.out.print("Digite a quantidade de usuarios que deseja cadastrar:");
        int qtdusuarios = scanner.nextInt();
        scanner.nextLine();

        String[][] novaMatriz = new String[qtdusuarios+ matrizCadastro.length][matrizCadastro[0].length];

        for (int linhas = 0; linhas < matrizCadastro.length; linhas++) {
            for (int colunas = 0; colunas < matrizCadastro[0].length; colunas++) {
                novaMatriz[linhas][colunas] = matrizCadastro[linhas][colunas];

            }
        }

        System.out.println("Preencha os dados a seguir: ");

        for (int linhas = matrizCadastro.length; linhas < novaMatriz.length ; linhas++) {
            for (int colunas = 0; colunas < matrizCadastro[0].length; colunas++) {
                System.out.print(matrizCadastro[0][colunas] + ": ");
                novaMatriz [linhas][colunas] = scanner.nextLine();

            }

        }
         return matrizCadastro = novaMatriz;
    }
    private static void exibirCadastro(String [] cabecalho){
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
