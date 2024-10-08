package Aula07.exercicios;

public class exercicio7 {
    public static void main(String[] args) {
        System.out.println("-------------------Exercício 7: Função para Determinar o Maior de Três Números-------------------");
        int numero = maiorNumero(5,6, 3123123);


    }

    static int maiorNumero(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2);
        } else if (num3 >= num1 && num3 >= num2) {
            System.out.println(num3);
        } return num1;

    }
}
