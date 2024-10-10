package Aula08.exemplos;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class exemplo4 {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("src\\Aula08\\textosDosExercicios\\arquivo.txt");
            int caracter;
            while ((caracter = fileReader.read()) != -1) {
                System.out.print((char) caracter);
            }
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
