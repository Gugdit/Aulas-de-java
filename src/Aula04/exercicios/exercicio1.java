package Aula04.exercicios;

import java.util.Scanner;
public class exercicio1 {
    public static void main(String[] args) {
        System.out.println("--------------------Exercício 1: Verificação de Acesso à Sistema--------------------");
        System.out.println("Você precisa de mais de +18 para entrar nesse site, digite sua idade.");
        Scanner scanner = new Scanner(System.in);
        int idadedousuario = scanner.nextInt();
        System.out.println("    ");
        System.out.println("Sua idade é " + idadedousuario);
        System.out.println("     ");
         if (idadedousuario >= 18) {
             System.out.println("Você tem permissão para entrar no site");
         } else {
             System.out.println("Você não tme permissão para entrar no site");
         }
    }
}
