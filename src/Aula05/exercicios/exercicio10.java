package Aula05.exercicios;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        System.out.println("-------------------Exercício 10: Verificação de Números pares e Impares com Interrupção-------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fale números de 0 a 100.");

        for (int i = 0; i <= 999; i++) {
            int numero = scanner.nextInt();
            if (numero % 2 == 0 && numero >=0 && numero <=100) {
                System.out.println("Número " + numero +" é par." );
            } else if (numero % 2 != 0 && numero >=0 && numero <=100) {
                System.out.println("Número " + numero +" é impar." );
            } else {
                System.out.println("Número muito grande, interrupção realizada.");
                break;
            }
        }

    }
}
