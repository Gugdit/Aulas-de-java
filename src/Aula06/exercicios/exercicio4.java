package Aula06.exercicios;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        System.out.println("-------------------Exercício 4: Média de Notas(double)-------------------");
        Scanner scanner = new Scanner(System.in);
        double[] vetor = new double[4];
        double vetor2 = vetor.length;
        double soma = 0;
        String mostraValor = "médias{";
        for (int posicao = 0; posicao < vetor.length; posicao++) {
            System.out.println("Fale a " + posicao + " nota.");
            vetor[posicao] = scanner.nextDouble();
            mostraValor += vetor[posicao];
            mostraValor += posicao < (vetor.length - 1) ? ", " : "}";
        }
        System.out.println(mostraValor);
        for (int posicao2 = 0; posicao2 < vetor.length; posicao2++) {
            soma += vetor[posicao2];
        }
        double media = soma / vetor2;
        System.out.println("A média das nota é: " + media);
    }
}
