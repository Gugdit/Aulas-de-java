package Aula08.exemplos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class exemplo7 {
    public static void main(String[] args) {
            try {
                FileWriter fileWriter = new FileWriter("src\\Aula08\\textosDosExercicios\\arquivo.txt", true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                bufferedWriter.write("\nTexto escrito no arquivo com buffer com modulo append");
                bufferedWriter.close();
            }catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

