package Aula08.exemplos;

public class exemplo9 {
    public static void main(String[] args) {
        String linha = "ID:1;Nome:Gustavo;Idade:17";

        String[] tokens = linha.split(";");
        for (String token : tokens) {
            System.out.println(token);
        }
        String valores = "";
        for (int i = 0; i < tokens.length; i++) {
            String[] chaveValor = tokens[i].split(":");
            valores += chaveValor[1] + (i < tokens.length - 1 ? ", " : ".");

        }
        System.out.println(valores);

        String[] idade = tokens[2].split(":");

        int valorIdade = Integer.parseInt(idade[1].trim());


        System.out.println("A idade agora é: " +(valorIdade+1));

    }
}
