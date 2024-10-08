package Aula05.exercicios;

import java.util.Random;
import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        System.out.println("-------------------Exercício 9: Jogo de Adivinhação-------------------");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean exit = true;
        int tentativas = 0;
        int numsecreto = random.nextInt(100);
        do {
            System.out.println("Adivinhe o número de 0 a 100");
            int numeroescolhido = scanner.nextInt();
            if (numeroescolhido == numsecreto) {
                System.out.println("Você escolheu o número certo");
                System.out.println("Tentativas: " + tentativas);
                exit = false;
            } else if (numeroescolhido > numsecreto) {
                System.out.println("Número escolhido é maior que o numero secreto, escolha outro!!!!");
                tentativas++;
            } else if (numeroescolhido < numsecreto) {
                System.out.println("Número escolhido é menor que o numero secreto, escolha outro!!!!");
                tentativas++;
            }

        } while (exit);
    }
}
