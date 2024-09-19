import java.util.Scanner;
public class exercicio4 {
    public static void main(String[] args) {
        System.out.println("--------------------Exercício 4: Cálculo de comissão--------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o valor da venda do funcionário?");
        double valorVenda = scanner.nextDouble();
        System.out.println("Valor da venda do funcionário é " + valorVenda);
        if (valorVenda <= 1000 && valorVenda >= 0) {
            double commissão5 = valorVenda * 0.05;
            System.out.println("Sua comissão foi de " + commissão5 +" Pois você vendeu menos que 1000");
        } else if (valorVenda >= 1000 && valorVenda <= 5000 && valorVenda >= 0) {
            double commissão10 = valorVenda * 0.10;
            System.out.println("Sua comissão foi de " + commissão10 +" Pois você vendeu entre 1000 a 5000");
        } else if (valorVenda > 5000 && valorVenda >= 0) {
            double commissão15 = valorVenda * 0.15 ;
            System.out.println("Sua comissão foi de " + commissão15 +" Pois você vendeu mais que 5000");
        } else {
            System.out.println("Esse número não existe.");
        }
    }

}
