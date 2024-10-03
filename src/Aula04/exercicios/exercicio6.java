package Aula04.exercicios;

import java.util.Scanner;
public class exercicio6 {
    public static void main(String[] args) {
        System.out.println("--------------------Exercício 6: Verificação de nota--------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a nota do aluno?");
        int notadoaluno = scanner.nextInt();
        System.out.println("A nota do aluno é " + notadoaluno);
        if (notadoaluno >= 7 && notadoaluno >= 0) {
            System.out.println("Você está aprovado");
        } else if (notadoaluno >= 5 && notadoaluno <= 7 && notadoaluno >= 0) {
            System.out.println("Você está em recuperação");
        } else if (notadoaluno <= 5 && notadoaluno >= 0) {
            System.out.println("Você está reprovado");
        } else {
            System.out.println("Não é permitido números negativos");
        }
    }
}
