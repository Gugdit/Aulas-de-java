package Aula06.exercicios;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        System.out.println("-------------------Exercício 7: Soma de Valores em uma Matriz-------------------");
        int [][] matriz = new int[3][3];
        String mostraValor = "matriz{";
        int resultado = 0;

        Scanner scanner = new Scanner(System.in);

        for (int linha = 0; linha < matriz.length; linha++) {
            mostraValor += "\t{";
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.println("Digite o elemento na posição {"+ linha +"}{" + coluna +"}");
                matriz[linha][coluna]= scanner.nextInt();
                mostraValor += matriz[linha][coluna];
                mostraValor += coluna < (matriz[linha].length - 1) ? ", " : "}";
            }
            mostraValor += linha < (matriz.length - 1) ? ".\n" : "\n}";
        }
        System.out.println(mostraValor);
        for (int posicao = 0; posicao < matriz.length; posicao++) {
            for (int posicao2 = 0; posicao2 < matriz[posicao].length; posicao2++) {
                resultado += matriz[posicao][posicao2];
            }

        }
        System.out.println("Somados eles resultam em: " + resultado);
    }
}
