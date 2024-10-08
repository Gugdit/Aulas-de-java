package Aula07.exercicios;

public class exercicio3 {
    public static void main(String[] args) {
        System.out.println("-------------------Exercício 3: Função para Calcular o Dobro de um Número-------------------");
        int dobro = dobrar(3,2);
        System.out.println(dobro);

    }
    static int dobrar(int num, int dobro) {
        return num * dobro;
    }
}
