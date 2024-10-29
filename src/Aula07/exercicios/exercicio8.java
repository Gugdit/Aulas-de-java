package Aula07.exercicios;

public class exercicio8 {
    public static void main(String[] args) {
        System.out.println("-------------------Exercício 8: Função que Calcula o Fatorial de um Número-------------------");
        int numero4 = calcularFatorial(5);
        System.out.println("Resultado do fatorial é " + numero4);

    }

    static int calcularFatorial(int numero) {

        int total;
        int resultado = numero;
        if (numero == 1) {
            System.out.println(numero);
            total = numero;
        }
        for (int vezes = numero - 1; vezes > 0;vezes--) {
            int total2 = resultado * vezes;
            resultado = total2;

        }
        total = resultado;
        return total;
        }

}
