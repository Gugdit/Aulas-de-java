package Aula05.exercicios;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        System.out.println("-------------------Exercício 5: Média de notas-------------------");
        double nota = 0, total = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5 ; i++) {
            System.out.println("Digite a " + i + " nota");
            nota = scanner.nextInt();
            if (nota >= 1 && nota <= 10) {
                total += nota;
            }
        }
        double resultado = total /5;
        System.out.println("A média é: " +resultado);


    }
}
