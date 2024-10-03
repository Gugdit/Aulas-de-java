package exercicios;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        System.out.println("-------------------Exercício 4: Média de Notas(double)-------------------");
        Scanner scanner = new Scanner(System.in);
        double[] vetor = new double[4];
        for (int posicao = 0; posicao < vetor.length; posicao++) {
            System.out.println("Fale a " + posicao + " nota.");
            vetor[posicao] = scanner.nextDouble();
        }
        System.out.println("As notas são: {" + vetor[0] +", " + vetor[1] +", " + vetor[2] +", " + vetor[3] +"}" );
        double soma = vetor[0] + vetor[1] + vetor[2] + vetor[3];
        double media = soma / 4;
        System.out.println("A média da nota é: " + media);
    }
}
