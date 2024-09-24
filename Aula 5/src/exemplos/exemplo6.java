package exemplos;

import java.util.Scanner;

public class exemplo6 {
    public static void main(String[] args) {
        int par = 0, impar=0, numero;
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10 ; i++) {
            System.out.println("Digite o " + i + " número");
            numero = scanner.nextInt();
            if (numero % 2 == 0) {
                par++;
            }else {
                impar++;
        }
            System.out.println("Você digitou " + par + " pares e 12"
                     + impar + " impares");



        }

    }
}
