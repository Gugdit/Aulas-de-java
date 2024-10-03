package exercicios;

public class exercicio4 {
    public static void main(String[] args) {
        System.out.println("-------------------Exercício 4: Função para Converter Graus Celsius para Fahrenheit-------------------");
        double fahrenheit = converterCelsiusParaFahrenheit(40);
        System.out.println(fahrenheit);
    }

    static double converterCelsiusParaFahrenheit(double celsius) {
         return celsius * 1.8 + 32;
    }

}
