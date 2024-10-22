package Desafio;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        System.out.println("-------------------Desafio!!!!-------------------");
        Scanner scanner = new Scanner(System.in);

        String[][] matriz = {};
        boolean entrada = true;

        while (entrada) {
            System.out.println("--------------------------------------------------" + "\n" + "Escolha uma das opções abaixo " + "\n" + "1-Cadastrar Usuário." + "\n" + "2-Consultar Usuários." + "\n" + "3-Atualizar Usuário." + "\n" + "4-Deletar Usuário." + "\n" + "5-Sair." + "\n" + "--------------------------------------------------");
            int escolhaMenu = scanner.nextInt();
            scanner.nextLine();
            switch (escolhaMenu) {
                case 1:
                    matriz = cadastrar(matriz);
                    break;
                case 2:
                    consultar(matriz);
                    break;
                case 3:
                    consultar(matriz);
                    matriz = atualizar(matriz);
                    break;
                case 4:
                    consultar(matriz);
                    matriz = deletar(matriz);
                    break;
                case 5:
                    entrada = false;
                    break;
                default:
                    System.out.println("Número escolhido não está dentro das opções, escolha outro.");
                    break;
            }
        }

    }

    static String[][] cadastrar(String[][] matriz) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantas pessoas você deseja cadastrar:");
        int numCadastros = scanner.nextInt();
        scanner.nextLine();
        matriz = new String[numCadastros + 1][4];
        for (int posicao = 1; posicao < numCadastros+1; posicao++) {
            System.out.println("Cadastro da pessoa " + posicao);
            System.out.print("ID: ");
            matriz[posicao][0] = scanner.nextLine();

            System.out.print("Nome: ");
            matriz[posicao][1] = scanner.nextLine();

            System.out.print("E-mail: ");
            matriz[posicao][2] = scanner.nextLine();

            System.out.print("Telefone: ");
            matriz[posicao][3] = scanner.nextLine();

        }
        return matriz;
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
    static String[][] atualizar(String[][] matriz){
        Scanner scanner = new Scanner(System.in);
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
            }

        }
        return matriz;
    }
    static String[][] deletar (String[][] matriz){
        Scanner scanner = new Scanner(System.in);
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

