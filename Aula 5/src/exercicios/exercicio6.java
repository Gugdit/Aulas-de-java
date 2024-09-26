package exercicios;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        System.out.println("-------------------Exercício 6: Sequência Fibonacci-------------------");
        double termo = 1, contador = 2, total = 0, termo2 = 1, termo3 = 2, total2 = 0;
        System.out.println("O termo 1 é: " + termo);
        System.out.println("O termo 2 é: " + termo2);
        while (contador <= 10) {
            contador++;
            total = termo2 + termo;
            total2 += total;

            System.out.println("O termo " + contador +" é: "+ total2);

        }
    }
}
