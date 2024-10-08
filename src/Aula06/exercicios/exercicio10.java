package Aula06.exercicios;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        System.out.println("-------------------Exercício 10: Maior Elemento de uma Matriz-------------------");
        int [][] matriz = new int[3][3];
        String mostraValor = "matriz{";

        Scanner scanner = new Scanner(System.in);
        int maior = 0;

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
        for (int posicao = 0; posicao < matriz.length; posicao++) {
            for (int posicao2 = 0; posicao2 < matriz[posicao].length; posicao2++) {
                for (int posicao3 = 0; posicao3 < matriz[posicao2].length; posicao3++) {
                    for (int posicao4 = 0; posicao4 < matriz[posicao3].length; posicao4++) {
                        if (matriz[posicao][posicao2] >= matriz[posicao3][posicao4]) {
                            if (maior >= matriz[posicao][posicao2]){
                                break;
                            }else {
                                maior = matriz[posicao][posicao2];
                            }

                        }

                    }

                }



                    }
                }
        System.out.println(mostraValor);
        System.out.println("O maior número é: " + maior);
    }
}
