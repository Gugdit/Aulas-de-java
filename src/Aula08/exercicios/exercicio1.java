package Aula08.exercicios;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------Exercício 1: Criar e Escrever em um Arquivo de Texto-------------------");
        try {
            FileWriter fileWriter = new FileWriter("src\\Aula08\\textosDosExercicios\\alunos.txt");
            for (int vezes = 0; vezes < 5; vezes++) {
                System.out.println("Fale o nome do " +vezes+" aluno.");
                String textoAluno = scanner.nextLine();
                fileWriter.write( vezes == 0 ? textoAluno : "\n"+textoAluno );
            }
            fileWriter.close();
            System.out.println("Pronto");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
