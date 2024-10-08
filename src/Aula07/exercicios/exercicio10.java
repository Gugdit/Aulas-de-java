package Aula07.exercicios;

public class exercicio10 {
    public static void main(String[] args) {
        System.out.println("-------------------Exercício 10: Função para Calcular o IMC-------------------");
        double imc = calcularIMC(86.0,1.8);


    }
    static double calcularIMC(double peso, double altura) {
        double calculo = peso / (altura*altura);
        System.out.println(calculo);
        return calculo;
    }
}
