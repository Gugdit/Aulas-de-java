package Aula08.exemplos;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;

public class exemplo2 {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("src\\Aula08\\textosDosExercicios\\arquivo.txt");
            fileWriter.write("Texto a ser gravado no arquivo");
            fileWriter.close();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
