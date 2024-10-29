package Aula07.exercicios;

public class exercicio6 {
    public static void main(String[] args) {
        System.out.println("-------------------Exercício 6: Função para Verificar se um Número é Par-------------------");
        boolean calcular = verificarPar(3);
        System.out.println("O número é " + calcular);

    }

    static Boolean verificarPar(int verificador) {
        boolean imparoupar = true;
        if (verificador % 2 == 0) {
            imparoupar = true;
        } else if (verificador % 2 != 0) {
            imparoupar = false;
        }return imparoupar;
    }
}
