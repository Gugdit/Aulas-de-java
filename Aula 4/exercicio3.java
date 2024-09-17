import java.util.Scanner;
public class exercicio3 {
    public static void main(String[] args) {
        System.out.println("--------------------Exercício 3: Classificação de Produto--------------------");
        System.out.println("Qual o codigo do seu produto?");
        Scanner scanner = new Scanner(System.in);
        int codigodoproduto = scanner.nextInt();
        System.out.println("O codigo do seu produto é " + codigodoproduto);
        switch (codigodoproduto){
            case 1:
                System.out.println("Seu produto é um Eletrônico");
                break;
            case 2:
                System.out.println("Seu produto é um Alimentos");
                break;
            case 3:
                System.out.println("Seu produto é um Vestuário");
                break;
            default:
                System.out.println("Esse produto não existe");
        }

    }
}
