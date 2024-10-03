package exemplos;

import java.util.Scanner;

public class exemplo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[4];

        System.out.print("Digite o primeiro numero");
        vetor[0] = scanner.nextInt();

        System.out.print("Digite o segundo numero");
        vetor[1] = scanner.nextInt();

        System.out.print("Digite o terceiro numero");
        vetor[2] = scanner.nextInt();

        System.out.print("Digite o quarto numero");
        vetor[3] = scanner.nextInt();

        System.out.println("Vetor{ " +vetor[0] +", " +vetor[1] +", " +vetor[2] +", " +vetor[3] +".}");

        System.out.println("------Vetor Fori------");
        int[] vetor2 = new int[5];

        for (int i = 0; i < vetor2.length; i++) {
            System.out.print("Digite o " + i +" numero.");
            vetor2[i] = scanner.nextInt();
        } System.out.print("Vetor Fori{ " +vetor2[0] +", " +vetor2[1] +", " +vetor2[2] +", " +vetor2[3] +", " +vetor2[4] + ".}");



    }
}
