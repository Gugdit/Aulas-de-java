public class exercicio2 {
    public static void main(String[] args) {
        System.out.println("--------------------Exercício 2: Desconto em compra--------------------");
        System.out.println("Qual o valor da sua compra");
        int valordacompra = 185;
        if (valordacompra >= 100) {
            int desconto = valordacompra / 10;
            int valorfinal = valordacompra - desconto;
            System.out.println("O valor da sua compra é " + valordacompra);
            System.out.println("Mas você recebeu um desconto de 10% por ter gastado mais de $100, agora sua compra agora está no valor de: " + valorfinal);
        } else {
            System.out.println("O valor a ser pago é: ");
        }
    }
}
