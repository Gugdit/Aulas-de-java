package Aula05.exemplos;

import java.util.Scanner;

public class exemplo32 {
    public static void main(String[] args) {
        String nome="Gustavo", nomeDigitado;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Digite seu nome");
            nomeDigitado = scanner.nextLine();

        }while (!nome.equals(nomeDigitado));
        System.out.println("Parabéns, esse é seu nome!!");
        scanner.close();
    }
}
