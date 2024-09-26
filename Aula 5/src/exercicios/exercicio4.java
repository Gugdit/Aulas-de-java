package exercicios;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        System.out.println("-------------------Exercício 4: Verificação de Número Primo-------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um número, para checar se ele é primo ou não");
        double numero = scanner.nextDouble();
        for (double contador = numero; contador >= 1; contador--) {
            double resultado = contador % numero;
            if (resultado == 0) {
                System.out.println("Seu numero não é um primo: " + numero);
                System.out.println("Acabou");
            } else if (resultado != 0) {
                System.out.println("Seu numero é um primo: " + numero);
                System.out.println("Acabou");

            }
        }
    }
}




