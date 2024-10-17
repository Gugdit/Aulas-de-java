package Aula08.exercicios;

import java.io.*;

public class exercicio3 {
    public static void main(String[] args) {
        System.out.println("-------------------Exercício 3: Copiar Conteúdo de um Arquivo para Outro-------------------");
        File arquivo = new File("src\\Aula08\\textosDosExercicios\\alunos.txt");
        if (arquivo.exists()) {
            try {
                String copiador = "";
                BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivo));
                String linha;
                while ((linha = bufferedReader.readLine()) != null) {
                    System.out.println(linha);
                    copiador += linha + "\n";
                }
                bufferedReader.close();
                FileWriter fileWriter = new FileWriter("src\\Aula08\\textosDosExercicios\\backup_alunos.txt");
                fileWriter.write(copiador);
                fileWriter.close();
            } catch (Exception e) {

                throw new RuntimeException();
            }

            }
        }
    }

