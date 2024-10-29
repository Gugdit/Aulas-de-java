package Desafio;

import java.io.*;
import java.util.Scanner;

public class DesafioMeu {

    static String[][] matriz = {null};
    static Scanner scanner = new Scanner(System.in);
    static String[] cabecalho = {"Id", "Nome", "Email", "Telefone"};
    static File bancoDeDados = new File("src\\Desafio\\bancoDeDados2.txt");

    public static void main(String[] args) {
        carregarDadosDoArquivo();
        System.out.println("-------------------Desafio!!!!-------------------");
        matriz[0] = cabecalho;
        boolean entrada = true;
        while (entrada) {
            System.out.println("--------------------------------------------------" + "\n" + "Escolha uma das opções abaixo " + "\n" + "1-Cadastrar Usuário." + "\n" + "2-Consultar Usuários." + "\n" + "3-Atualizar Usuário." + "\n" + "4-Deletar Usuário." + "\n" + "5-Sair." + "\n" + "--------------------------------------------------");
            int escolhaMenu = scanner.nextInt();
            scanner.nextLine();
            switch (escolhaMenu) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    consultar();
                    break;
                case 3:
                    atualizar();
                    break;
                case 4:
                    deletar();
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

    static String[][] cadastrar() {
        System.out.print("Digite a quantidade de usuarios que deseja cadastrar:");
        int qtdusuarios = scanner.nextInt();
        scanner.nextLine();

        String[][] novaMatriz = new String[qtdusuarios + matriz.length][matriz[0].length];

        for (int linhas = 0; linhas < matriz.length; linhas++) {
            for (int colunas = 0; colunas < matriz[0].length; colunas++) {
                novaMatriz[linhas][colunas] = matriz[linhas][colunas];

            }
        }

        System.out.println("Preencha os dados a seguir: ");

        for (int linhas = matriz.length; linhas < novaMatriz.length; linhas++) {
            novaMatriz[linhas][0] = String.valueOf(linhas);
            for (int colunas = 1; colunas < matriz[0].length; colunas++) {
                System.out.print(matriz[0][colunas] + ": ");
                novaMatriz[linhas][colunas] = scanner.nextLine();
            }
        }
        salvarDadosNoArquivo();
        return matriz = novaMatriz;
    }

    static String[][] consultar() {
        System.out.println("--------------------------------------------------");
        System.out.println("ID" + "\t" + "Nome" + "\t\t\t" + "E-mail" + "\t\t\t\t\t" + "Telefone");
        for (int posicao2 = 1; posicao2 < matriz.length; posicao2++) {
            System.out.println(matriz[posicao2][0] + "\t" + matriz[posicao2][1] + "\t\t\t" + matriz[posicao2][2] + "\t\t\t" + matriz[posicao2][3]);
        }
        System.out.println("--------------------------------------------------");
        return matriz;

    }

    static String[][] atualizar() {
        consultar();
        System.out.print("Qual usuário você deseja Atualizar/editar:");
        String editar = scanner.nextLine();
        for (int posicao3 = 1; posicao3 < matriz.length; posicao3++) {
            if (editar.equals(matriz[posicao3][0])) {
                for (int posicao5 = 1; posicao5 < matriz[posicao3].length; posicao5++) {
                    System.out.print(matriz[0][posicao5] + ": ");
                    matriz[posicao3][posicao5] = scanner.nextLine();

                }
            } else {
                System.out.println("Esse usuário não existe, escolha outro.");
                break;
            }

        }
        salvarDadosNoArquivo();
        return matriz;
    }

    static String[][] deletar() {
        consultar();
        System.out.print("Digite o id do usuário que deseja deletar:");
        int idUsuario = scanner.nextInt();
        scanner.nextLine();

        String[][] novaMatriz = new String[matriz.length - 1][matriz[0].length];
        novaMatriz[0] = cabecalho;
        for (int linhaMatrizCadastro = 1, linhaNovaM = 1; linhaMatrizCadastro < matriz.length; linhaMatrizCadastro++) {
            if (idUsuario == linhaMatrizCadastro)
                continue;
            novaMatriz[linhaNovaM] = matriz[linhaMatrizCadastro];
            novaMatriz[linhaNovaM][0] = String.valueOf(linhaNovaM);
            linhaNovaM++;
        }
        matriz = novaMatriz;
        consultar();
        salvarDadosNoArquivo();
        return matriz;


    }

     static void salvarDadosNoArquivo() {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(bancoDeDados))) {
            for (String[] linhaMatriz : matriz) {
                bufferedWriter.write(String.join(",", linhaMatriz) + "\n");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void carregarDadosDoArquivo() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(bancoDeDados))) {
            if (!bancoDeDados.exists())
                return;
            String linha = "", dados = "";

            while ((linha = bufferedReader.readLine()) != null) {
                dados += linha + "\n";
            }

            String[] qtdLinhas = dados.split("\n");
            int qtdColunas = qtdLinhas[0].split(",").length;

            matriz = new String[qtdLinhas.length][qtdColunas];

            for (int linhas = 0; linhas < qtdLinhas.length; linhas++) {
                matriz[linhas] = qtdLinhas[linhas].split(",");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}

