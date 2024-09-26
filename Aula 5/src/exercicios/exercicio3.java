package exercicios;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        System.out.println("-------------------Exercício 3: Cálculo de fatorial-------------------");
        System.out.println("Fale um número");
        Scanner scanner = new Scanner(System.in);
        double numero = scanner.nextInt();
        double fatorial = numero;
        do {
            fatorial--;
            double numero2 = numero *= fatorial;
            double numero3 = numero2/fatorial;
            if (fatorial==1) {
                System.out.println("O seu fatorial é mais bonito que o igor" + numero3);
            }

        } while (fatorial >= 0);

    }
}
