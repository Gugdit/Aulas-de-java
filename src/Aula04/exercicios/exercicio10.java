package Aula04.exercicios;

import java.util.Scanner;
public class exercicio10 {
    public static void main(String[] args) {
        System.out.println("--------------------Exercício 10: Conversão de moedas--------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Códigos para a moeda a ser convertida, 1-Dólar, 2-Euro, 3-Libra ");
        System.out.println("Digite um codigo para moedas");
        int codigomoeda = scanner.nextInt();
        System.out.println("Seu codigo é " +codigomoeda);
        System.out.println("Digite um valor em reais");
        double valorreais = scanner.nextDouble();
        if (valorreais > 0){
            switch (codigomoeda) {
                case 1:
                    double dólares= valorreais * 0.18;
                    System.out.println("Você escolheu dólares seus " + valorreais +" é igual á: "+ dólares +" Dólares");
                    break;
                case 2:
                    double euros = valorreais * 0.16;
                    System.out.println("Você escolheu euros seus " + valorreais +" é igual á: "+ euros +" Euros");
                    break;
                case 3:
                    double libras = valorreais * 0.14;
                    System.out.println("Você escolheu libras seus " + valorreais +" é igual á: "+ libras +" Libras");
                    break;
                default:
                    System.out.println("Esse código não existe, escolha outro.");
            }
        } else if (valorreais < 0) {
            System.out.println("Valor incorreto, digite denovo.");

        }
    }
}
