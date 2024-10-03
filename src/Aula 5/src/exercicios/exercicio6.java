package exercicios;

public class exercicio6 {
    public static void main(String[] args) {
        System.out.println("-------------------Exercício 6: Sequência Fibonacci-------------------");
        double termo = 1, termo2 = 1;
        int contador = 2;
        System.out.println("O termo 1 é: " + termo);
        System.out.println("O termo 2 é: " + termo2);
        while (contador <= 9) {
            contador++;
            double termo3 = termo + termo2;
            termo = termo2;
            termo2 = termo3;
            System.out.println("O termo " + contador +" é: " + termo3);
        }
    }
}
