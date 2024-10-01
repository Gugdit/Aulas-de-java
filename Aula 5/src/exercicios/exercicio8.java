package exercicios;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        System.out.println("-------------------Exercício 8: Contagem de Números Pares e Ímpares-------------------");
        Scanner scanner = new Scanner(System.in);
        int par = 0, impar = 0, numero;
        for (int i = 1; i <= 10 ; i++) {
            System.out.println("Digite o " + i + " número");
            numero = scanner.nextInt();
            if (numero % 2 == 0) {
                par++;
            }else {
                impar++;
        }
        }System.out.println("Você digitou " + par + " pares e "
                    + impar + " impares");

    }
}
