package Aula02.exemplos;

import java.util.Scanner;
public class Exemplos {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu nome");
        String name = scanner.nextLine();

        System.out.print("Digite a sua idade");
        int idade = scanner.nextInt();

        System.out.print("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Nome " + name);
        System.out.println("Idade " + idade);
        System.out.println("Altura " + altura);


        // Exemplo 2
        System.out.println("Digite um numero");
        int numero = scanner.nextInt();

        System.out.println(" Seu numero é "+ numero);

        System.out.println("Digite o seu nome: ");
        name = scanner.nextLine();

        System.out.println("Seu nome é: "+ name);
        scanner.close();
    }
}
