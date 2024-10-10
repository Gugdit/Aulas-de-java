package Aula08.exemplos;

import java.io.FileWriter;
import java.io.IOException;

public class exemplo3 {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("src\\Aula08\\textosDosExercicios\\arquivo.txt",true);
            fileWriter.write("\nTexto escrito com o modulo append habilitado");
            fileWriter.close();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
