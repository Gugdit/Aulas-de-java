package Desafio;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        System.out.println("-------------------Desafio!!!!-------------------");
        System.out.println("--------------------------------------------------"+"\n"+"Escolha uma das opções abaixo "+"\n"+"1-Cadastrar Usuário."+"\n"+"2-Consultar Usuários."+"\n"+"3-Atualizar Usuário."+"\n"+"4-Deletar Usuário."+"\n"+"5-Sair."+"\n"+"--------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        int escolhaMenu = scanner.nextInt();
        switch (escolhaMenu) {
            case 1:
                System.out.println("Quantas pessoas você deseja cadastrar?");
                int numCadastros =scanner.nextInt();
                scanner.nextLine();
                String[][] matriz = new String[numCadastros][4];
                for (int posicao = 0; posicao < numCadastros; posicao++) {
                     System.out.println("Cadastro da pessoa " + posicao);
                     System.out.println("ID: ");
                     matriz[posicao][0] = scanner.nextLine();

                     System.out.println("Nome: ");
                     matriz[posicao][1] = scanner.nextLine();

                     System.out.println("E-mail: ");
                     matriz[posicao][2] = scanner.nextLine();

                     System.out.println("Telefone: ");
                     matriz[posicao][3] = scanner.nextLine();

                }
                System.out.println("ID" + "\t" + "Nome" + "\t" + "E-mail" + "\t\t\t" + "Telefone");
                for (int posicao2 = 0; posicao2 < numCadastros ; posicao2++) {
                    System.out.println(matriz[posicao2][0] + "\t" + matriz[posicao2][1] + "\t" + matriz[posicao2][2] + "\t" + matriz[posicao2][3]);

            }
        }
    }
}

