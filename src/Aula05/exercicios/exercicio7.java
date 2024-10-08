package Aula05.exercicios;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        System.out.println("-------------------Exercício 7: Validação de entrada-------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fale um número dentro do intervalo de 0 a 10, para validar entrada");
        int numero = scanner.nextInt();
        boolean exit = true;
        do {
            if (numero >=0 && numero <= 10){
                System.out.println("Sua entrada foi validada, seu número é: " + numero);
                exit = false;
            }else if (numero > 10) {
                System.out.println("Sua entrada não foi validada, seu número é: " + numero +", digite outro número que esteja dentro do intervalo de 0 a 10.");
                exit = false;
            }
        } while (exit);

    }
}
