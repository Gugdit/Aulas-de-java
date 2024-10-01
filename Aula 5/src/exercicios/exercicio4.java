package exercicios;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        System.out.println("-------------------Exercício 4: Verificação de Números Primos-------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um número, para checar se ele é primo ou não");
        int numero = scanner.nextInt();
        for (boolean exit = true; exit == true;) {
            if (numero >= 1 && numero % 2 == 0 && numero != 2 || numero >= 1 && numero % 3 == 0 && numero != 3 || numero >= 1 && numero % 5 == 0 && numero != 5 || numero >= 1 && numero % 7 == 0 && numero != 7) {
                System.out.println("Seu numero não é um primo: " + numero);
                exit = false;
            } else if ( numero >= 1 && numero % 2 != 0 || numero >= 1 && numero % 3 != 0 || numero >= 1 && numero % 5 != 0 || numero >= 1 && numero % 7 != 0) {
                System.out.println("Seu numero é um primo: " + numero);
                exit = false;
            } else if (numero < 1) {
                System.out.println("Este número não está dentro dos parametros escolha outro.");
                exit = false;
            }
        }
    }
}




