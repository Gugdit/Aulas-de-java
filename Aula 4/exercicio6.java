public class exercicio6 {
    public static void main(String[] args) {
        System.out.println("--------------------Exercício 6: Verificação de nota--------------------");
        int notadoaluno = 4;
        if (notadoaluno >= 7) {
            System.out.println("Você está aprovado, " + "sua nota foi: " + notadoaluno);
        } else if (notadoaluno >= 5 && notadoaluno <= 7) {
            System.out.println("Você está em recuperação, " + "sua nota foi: " + notadoaluno);
        } else if (notadoaluno <= 5) {
            System.out.println("Você está reprovado, " + "sua nota foi: " + notadoaluno);
        }
    }
}