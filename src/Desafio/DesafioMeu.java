package Desafio;

import java.util.Scanner;

public class DesafioMeu {

    static String[][] matriz = {null};

    public static void main(String[] args) {
        System.out.println("-------------------Desafio!!!!-------------------");
        Scanner scanner = new Scanner(System.in);
        String[] cabecalho = {"Id","Nome","Email","Telefone"};

        matriz[0] = cabecalho;
        boolean entrada = true;

        while (entrada) {
            System.out.println("--------------------------------------------------" + "\n" + "Escolha uma das opções abaixo " + "\n" + "1-Cadastrar Usuário." + "\n" + "2-Consultar Usuários." + "\n" + "3-Atualizar Usuário." + "\n" + "4-Deletar Usuário." + "\n" + "5-Sair." + "\n" + "--------------------------------------------------");
            int escolhaMenu = scanner.nextInt();
            scanner.nextLine();
            switch (escolhaMenu) {
                case 1:
                    matriz = cadastrar(matriz, scanner);
                    break;
                case 2:
                    consultar(matriz);
                    break;
                case 3:
                    matriz = atualizar(matriz, scanner);
                    break;
                case 4:
                    matriz = deletar(matriz, scanner);
                    break;
                case 5:
                    System.out.println("Fim do programa");
                    entrada = false;
                    break;
                default:
                    System.out.println("Número escolhido não está dentro das opções, escolha outro.");
                    break;
            }
        }
        scanner.close();
    }

    static String[][] cadastrar(String[][] matriz, Scanner scanner) {
        System.out.print("Digite a quantidade de usuarios que deseja cadastrar:");
        int qtdusuarios = scanner.nextInt();
        scanner.nextLine();

        String[][] novaMatriz = new String[qtdusuarios+ matriz.length][matriz[0].length];

        for (int linhas = 0; linhas < matriz.length; linhas++) {
            for (int colunas = 0; colunas < matriz[0].length; colunas++) {
                novaMatriz[linhas][colunas] = matriz[linhas][colunas];

            }
        }

        System.out.println("Preencha os dados a seguir: ");

        for (int linhas = matriz.length; linhas < novaMatriz.length ; linhas++) {
            for (int colunas = 0; colunas < matriz[0].length; colunas++) {
                System.out.print(matriz[0][colunas] + ": ");
                novaMatriz [linhas][colunas] = scanner.nextLine();
            }
        }
        return novaMatriz;
    }

    static String[][] consultar(String[][] matriz) {
        System.out.println("--------------------------------------------------");
        System.out.println("ID" + "\t" + "Nome" + "\t\t\t" + "E-mail" + "\t\t\t\t\t" + "Telefone");
        for (int posicao2 = 1; posicao2 < matriz.length; posicao2++) {
            System.out.println(matriz[posicao2][0] + "\t" + matriz[posicao2][1] + "\t\t\t" + matriz[posicao2][2] + "\t\t\t" + matriz[posicao2][3]);
        }
        System.out.println("--------------------------------------------------");
        return matriz;

    }
    static String[][] atualizar(String[][] matriz, Scanner scanner){
        consultar(matriz);
        System.out.print("Qual usuário você deseja Atualizar/editar:");
        String editar = scanner.nextLine();
        for (int posicao3 = 0; posicao3 < matriz.length; posicao3++) {
            if (editar.equals(matriz[posicao3][0])) {
                System.out.println("Cadastro da pessoa " + posicao3);
                System.out.print("ID: ");
                matriz[posicao3][0] = scanner.nextLine();

                System.out.print("Nome: ");
                matriz[posicao3][1] = scanner.nextLine();

                System.out.print("E-mail: ");
                matriz[posicao3][2] = scanner.nextLine();

                System.out.print("Telefone: ");
                matriz[posicao3][3] = scanner.nextLine();
            }else {
                System.out.println("Esse usuário não existe, escolha outro.");
                break;
            }

        }
        return matriz;
    }
    static String[][] deletar (String[][] matriz, Scanner scanner){
        consultar(matriz);
        System.out.print("Qual usuário você deseja apagar:");
        String deletar = scanner.nextLine();
        for (int posicao4 = 0; posicao4 < matriz.length; posicao4++) {
            if (deletar.equals(matriz[posicao4][0])) {
                matriz[posicao4][0] = "";
                matriz[posicao4][1] = "";
                matriz[posicao4][2] = "";
                matriz[posicao4][3] = "";

                }

            }
        return matriz;

        }
}

