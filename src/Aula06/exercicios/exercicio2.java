package Aula06.exercicios;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        System.out.println("-------------------Exercício 2: Busca de Caracteres em um Vetor-------------------");
        Scanner scanner = new Scanner(System.in);
        String[] caracteres = new String[6];
        for (int posicao = 0; posicao < caracteres.length; posicao++) {
            System.out.println("Digite o " + posicao +" caractere.");
            caracteres[posicao] = scanner.nextLine();
        }
        System.out.println("Digite um caractere para ser encontrado no vetor");
        String caractereEscolhido = scanner.nextLine();
        for (int posicao2 = 0; posicao2 < caracteres.length; posicao2++) {
            if (!caractereEscolhido.equals(caracteres[posicao2])) {
                System.out.println("O caractere não existe na posição " + posicao2);
                continue;
            } else if (caractereEscolhido.equals(caracteres[posicao2])) {
                System.out.println("Seu caractere: " + caractereEscolhido + ". Existe no vetor, sua posição é: " + posicao2);
                break;
            }

        }
    }
}
