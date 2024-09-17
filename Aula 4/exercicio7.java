public class exercicio7 {
    public static void main(String[] args) {
        System.out.println("--------------------Exercício 7: Escolha de Operação--------------------");
        double numero1 = 5;
        double numero2 = 8;
        System.out.println("Seus numeros escolhidos foram " + numero1 +" e "+ numero2);
        System.out.println("Escolha uma opção, 1-Soma, 2-Subtração, 3-Multiplicação, 4-Divisão. ");
        int operação = 3;
        System.out.println("Seu número escolhido é " + operação);
        switch (operação) {
            case 1:
                double operação1 = numero1 + numero2;
                System.out.println("A operação foi soma, o resultado é: " + operação1);
                break;
            case 2:
                double operação2 = numero1 - numero2;
                System.out.println("A operação foi subtração, o resultado é: " + operação2);
                break;
            case 3:
                double operação3 = numero1 * numero2;
                System.out.println("A operação foi multiplicação, o resultado é: " + operação3);
                break;
            case 4:
                double operação4 = numero1 / numero2;
                System.out.println("A operação foi divisão, o resultado é: " + operação4);
                break;
            default:
                System.out.println("Essa operação não existe, escolha outra.");

        }
    }
}
