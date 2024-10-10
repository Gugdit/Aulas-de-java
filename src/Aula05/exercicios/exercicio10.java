package Aula05.exercicios;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        System.out.println("-------------------Exercício 10: Verificação de Números pares e Impares com Interrupção-------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fale números de 0 a 100.");
        int[] vetorNumero = new int[10];

        for (int posicao = 0; posicao < vetorNumero.length; posicao++) {
            System.out.println("Fale um número.");
            int numero = scanner.nextInt();
            if (numero >= 0 && numero <=100){
                vetorNumero[posicao] = numero;
            }else{
                System.out.println("Número muito grande, interrupção realizada.");
                break;
            }
        }
        for (int posição2 = 0; posição2 < vetorNumero.length; posição2++) {
            if (vetorNumero[posição2] % 2 == 0){
                System.out.println("Número: " + vetorNumero[posição2] +" é par.");
            } else if (vetorNumero[posição2] % 2 != 0) {
                System.out.println("Número: " + vetorNumero[posição2] +" é impar.");

            }

        }

    }
}
