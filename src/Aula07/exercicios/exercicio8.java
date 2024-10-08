package Aula07.exercicios;

public class exercicio8 {
    public static void main(String[] args) {
        System.out.println("-------------------Exercício 8: Função que Calcula o Fatorial de um Número-------------------");
        int numero4 = calcularFatorial(2);

    }

    static int calcularFatorial(int numero) {
        int fatorial = numero;
        if (numero == 1) {
            System.out.println(numero);
        } else if (numero >= 0) {
            do {
                fatorial--;
                int numero2 = numero *= fatorial;
                int numero3 = numero2 / fatorial;
                if (fatorial == 1) {
                    System.out.println(numero3);
                }

            } while (fatorial >= 0);
        }else {
            System.out.println("Erro");
        }
        return numero;
    }
}
