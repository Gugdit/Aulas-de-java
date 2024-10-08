package Aula05.exercicios;

public class exercicio2 {
    public static void main(String[] args) {
        System.out.println("-------------------Exercício 2: Soma de números pares-------------------");
        int contador = 1;
        int soma = 0;
        while (contador <= 100) {
            contador++;
//            if(soma == 0){
//                soma = contador;
//            }
            if (contador % 2 ==0) {
                soma += contador;
                System.out.println("Numero é " + soma);

            }

        }
    }
}
