package Aula02.exercicios;

public class exercicio10 {
    public static void main(String [] args) {
        System.out.println("---------------------Exercicio 10: Diferença Entre Tipos de Dados---------------------");
        short variavelShort = 150;
        int variavelInt = variavelShort;
        byte variavelByte = (byte) variavelShort;

        System.out.println("Valores: " + variavelShort+"   "+ variavelInt +"   "+ variavelByte);
    }
}
