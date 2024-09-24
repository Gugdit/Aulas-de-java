import java.util.Scanner;
public class exemplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = "Gustavo", digitada="";

        while (nome.equals(digitada)){
            System.out.println("Digite seu nome");
            digitada= scanner.next();
        }
        System.out.println("Parabens esse é seu nome");
    }
}
