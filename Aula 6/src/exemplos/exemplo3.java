package exemplos;

import java.util.Scanner;

public class exemplo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de vetores que você quer.");
        int marcacaoVetor = scanner.nextInt();
        int[] vetor = new int[marcacaoVetor];
        String mostraValor = "Vetor{";

        for (int posicao = 0; posicao < vetor.length; posicao++) {
            System.out.println("Digite o " + posicao +" numero.");
            vetor[posicao] = scanner.nextInt();
            mostraValor += vetor[posicao];
            mostraValor += posicao< vetor.length -1 ? ", " :"}";


        }
        System.out.println(mostraValor);
    }
}
