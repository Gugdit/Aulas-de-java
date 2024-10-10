package Aula08.exemplos;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class exemplo1 {
    public static void main(String[] args) {
        File arquivo = new File("G:\\Rafael\\Atividades Importantes\\Aulas de Java\\src\\Aula08\\textosDosExercicios\\arquivo.txt");
        if (arquivo.exists()){
            System.out.println("Arquivo existe");
        }else {
            try {
                if (arquivo.createNewFile()){
                    System.out.println(arquivo.getName() +"Criado com sucesso");
                }

            }catch (IOException e){
                throw new RuntimeException(e);
            }
        }
    }

    }



