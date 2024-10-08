package Aula06.exercicios;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        System.out.println("-------------------Exercício 9: Contando Números Pares em uma Matriz-------------------");
        int [][] matriz = new int[4][4];
        String mostraValor = "matriz{";

        Scanner scanner = new Scanner(System.in);
        int par = 0;

        for (int linha = 0; linha < matriz.length; linha++) {
            mostraValor += "\t{";
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.println("Digite o elemento na posição {"+ linha +"}{" + coluna +"}");
                matriz[linha][coluna]= scanner.nextInt();
                mostraValor += matriz[linha][coluna];
                mostraValor += coluna < (matriz[linha].length - 1) ? ", " : "}";
                if (matriz[linha][coluna] % 2 == 0) {
                    par++;
                }
            }
            mostraValor += linha < (matriz.length - 1) ? ".\n" : "\n}";
        }
        System.out.println(mostraValor);
        for (int posição = 0; posição < matriz.length; posição++) {
            for (int posição2 = 0; posição2 < matriz[posição].length; posição2++) {
                if (matriz[posição][posição2] % 2 == 0){
                    System.out.println("Numero: " + matriz[posição][posição2]+" é par");
                } else {
                    System.out.println("Numero: " + matriz[posição][posição2]+" não é par");
                }

            }

        }
        System.out.println("Existem " + par +" números pares.");
    }
}
