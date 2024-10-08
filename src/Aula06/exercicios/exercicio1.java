package Aula06.exercicios;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        System.out.println("-------------------Exercício 1: Soma de Elementos Inteiros em um Vetor-------------------");
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];
        for (int posicao = 0; posicao < vetor.length; posicao++) {
            System.out.println("Digite o " + posicao +" numero.");
            vetor[posicao] = scanner.nextInt();
        }
        System.out.println("Os números dos vetores são: {" + vetor[0] +", " + vetor[1] +", " + vetor[2] +", " + vetor[3] +", " + vetor[4] +".}" );
        int resultado = vetor[0] + vetor[1] + vetor[2] + vetor[3] + vetor[4];
        System.out.println("Somados são: " + resultado);
    }
}
