package Aula07.exercicios;

public class exercicio6 {
    public static void main(String[] args) {
        System.out.println("-------------------Exercício 6: Função para Verificar se um Número é Par-------------------");
        int calcular = verificarPar(1);

    }

    static int verificarPar(int verificador) {
        boolean imparoupar;
        if (verificador % 2 == 0) {
            imparoupar = true;
            System.out.println(imparoupar);
        } else if (verificador % 2 != 0) {
            imparoupar = false;
            System.out.println(imparoupar);
        }return verificador;
    }
}
