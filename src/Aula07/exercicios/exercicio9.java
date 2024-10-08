package Aula07.exercicios;

public class exercicio9 {
    public static void main(String[] args) {
        System.out.println("-------------------Exercício 9: Função para Calcular a Potência de Um Número-------------------");
        int calculo = calcularPotencia(5,8);


    }

    static int calcularPotencia(int base, int expoente) {
        int base2 = base;
        if (expoente == 1){
            System.out.println(base);
        }
        for (int expoente2 = expoente; expoente2 >= 0;) {
            int resultado = base * base2;
            base2 = resultado;
            expoente2--;
            if (expoente2 == 1) {
                System.out.println(resultado);
            }
        }
        return expoente;



    }

}
