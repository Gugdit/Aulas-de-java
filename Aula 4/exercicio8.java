import java.util.Scanner;
public class exercicio8 {
    public static void main(String[] args) {
        System.out.println("--------------------Exercício 8: Avaliação de Desempenho--------------------");
        Scanner scanner = new Scanner(System.in);
        int notaavaliação = 4;
        System.out.println("Avalie o desempenho em uma escala de 1 a 5, 1-Precisa melhorar, 2-Abaixo da média, 3-Média, 4-Acima da média, 5-Excelente");
        System.out.println("Sua nota de avaliação é " + notaavaliação);
        switch (notaavaliação) {
            case 1:
                System.out.println("Precisa melhorar 1.0");
                break;
            case 2:
                System.out.println("Abaixo da média 2.0");
                break;
            case 3:
                System.out.println("Média 3.0");
                break;
            case 4:
                System.out.println("Acima da média 4.0 ");
                break;
            case 5:
                System.out.println("Excelente 5.0 ");
                break;
            default:
                System.out.println("Esse nota não existe, escolha outra.");

    }
}
}
