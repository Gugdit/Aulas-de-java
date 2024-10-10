package Aula08.exemplos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class exemplo8 {
    public static void main(String[] args) {
        File arquivo = new File("src\\Aula08\\textosDosExercicios\\arquivo.txt");
        if (arquivo.exists()){
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivo));
                String linha;
                while ((linha = bufferedReader.readLine())!=null) {
                    System.out.println(linha);
                }
                bufferedReader.close();
            }catch (Exception e) {
                throw new RuntimeException();
            }
        }
    }
}
