package Aula06.exercicios;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        System.out.println("-------------------Exercício 5: Vetor de Strings-------------------");
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[3];
        for (int posicao = 0; posicao < nomes.length; posicao++) {
            System.out.println("Digite o " + posicao + " nome.");
            nomes[posicao] = scanner.nextLine();
        }
        System.out.println("Digite um nome para ser encontrado no vetor.");
        String nomeEscolhido = scanner.nextLine();
        for (int posicao2 = 0; posicao2 < nomes.length; posicao2++) {
            if (!nomeEscolhido.equals(nomes[posicao2])) {
                System.out.println("O nome digitado não existe na posição " + posicao2);
                continue;
            } else if (nomeEscolhido.equals(nomes[posicao2])) {
                System.out.println("O nome digitado: " + nomeEscolhido + ". Existe no vetor, sua posição é: " + posicao2);
                break;
            }
        }
    }
}
