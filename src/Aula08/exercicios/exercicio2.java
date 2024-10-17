package Aula08.exercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class exercicio2 {
    public static void main(String[] args) {
        System.out.println("-------------------Exercício 2: Leitura de Arquivo de Texto-------------------");
        File arquivo = new File("src\\Aula08\\textosDosExercicios\\alunos.txt");
        if (arquivo.exists()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivo));
                String linha;
                while ((linha = bufferedReader.readLine()) != null) {
                    System.out.println(linha);
                }
                bufferedReader.close();
            } catch (Exception e) {

                throw new RuntimeException();
            }
        }
    }
}
