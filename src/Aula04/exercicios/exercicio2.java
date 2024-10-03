package Aula04.exercicios;

import java.util.Scanner;
public class exercicio2 {
    public static void main(String[] args) {
        System.out.println("--------------------Exercício 2: Desconto em compra--------------------");
        System.out.println("Qual o valor da sua compra?");
        Scanner scanner = new Scanner(System.in);
        int valordacompra = scanner.nextInt();
        System.out.println("O valor da sua compra é: " + valordacompra);
        if (valordacompra >= 100) {
            int desconto = valordacompra / 10;
            int valorfinal = valordacompra - desconto;
            System.out.println("O valor da sua compra é " + valordacompra);
            System.out.println("Mas você recebeu um desconto de 10% por ter gastado mais de $100, agora sua compra agora está no valor de: " + valorfinal);
        } else if (valordacompra <= 100 && valordacompra >= 0){
            System.out.println("O valor a ser pago é: ");
        } else {
            System.out.println("Esse número não está dentro dos parâmetros, escolha outro.");
        }
    }
}
