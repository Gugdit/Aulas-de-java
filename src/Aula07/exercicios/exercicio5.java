package Aula07.exercicios;

public class exercicio5 {
    public static void main(String[] args) {
        System.out.println("-------------------Exercício 5: Função para Calcular a Média de Três Notas-------------------");
        int calculo2 = calcularMedia(6,7,6);
        System.out.println(calculo2);
    }
    static int calcularMedia(int nota1, int nota2, int nota3) {
        int calculo = nota1 + nota2 + nota3;
        return calculo / 3;
    }
}
