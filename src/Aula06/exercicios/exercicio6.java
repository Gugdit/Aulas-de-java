package Aula06.exercicios;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        System.out.println("-------------------Exercício 6: Preenchendo uma Matriz-------------------");
        int [][] matriz = new int[2][2];
        String mostraValor = "matriz{";

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

    }
}
