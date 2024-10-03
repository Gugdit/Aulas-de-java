package Aula02.exercicios;

public class exercicio9 {
    public static void main(String [] args) {
        System.out.println("---------------------Exercicio 9: Conversão de Tipos (Casting Implícito e Explícito)---------------------");
        float variavelFloat = 15.6f;
        long variavelLong = (long) variavelFloat;
        double variavelDouble = variavelLong;

        System.out.println("Float: " + variavelFloat +"   "+"Long: " + variavelLong +"    "+"Double: " + variavelDouble);

    }
}
