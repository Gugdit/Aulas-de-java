package Aula02.exercicios;

public class exercicio6 {
    public static void main(String[] args) {
        System.out.println("---------------------Exercicio 6: Comparação de Dois Números---------------------");
        int número1 = 9;
        int número2 = 5;
        boolean comparação1 =  número1 <= número2;
        boolean comparação2 =  número1 == número2;
        boolean comparação3 =  número1 != número2;
        boolean comparação4 =  número1 >= número2;
        boolean comparação5 =  número1 < número2;
        boolean comparação6 =  número1 > número2;

        System.out.println("int1: " + número1 );
        System.out.println("int2: " + número2);
        System.out.println("Comparação menor ou igual a: " + comparação1);
        System.out.println("Comparação igual: " + comparação2);
        System.out.println("Comparação diferente: " + comparação3);
        System.out.println("Comparação maior ou igual a: " + comparação4);
        System.out.println("Comparação5 menor que: " + comparação5);
        System.out.println("Comparação6 maior que: " + comparação6);
    }
}
