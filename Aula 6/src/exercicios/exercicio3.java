package exercicios;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        System.out.println("-------------------Exercício 3: Contagem de Valores Booleanos-------------------");
        boolean[] vetor = new boolean[8];
        Scanner scanner = new Scanner(System.in);
        int trues = 0, falses = 0;
        for (int posicao = 0; posicao < vetor.length; posicao++) {
            System.out.println("Digite o " + posicao +" boolean.");
            vetor[posicao] = scanner.nextBoolean();
            if (vetor[posicao] == true) {
                trues++;
            } else if (vetor[posicao] == false) {
                falses++;
            }
            System.out.println("Existem: " + trues + " trues e " + falses + " falses.");

}
    }
}
