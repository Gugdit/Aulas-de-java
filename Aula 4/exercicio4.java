public class exercicio4 {
    public static void main(String[] args) {
        System.out.println("--------------------Exercício 4: Cálculo de comissão--------------------");
        double valorVenda = 59012;
        System.out.println("Valor da venda do funcionário é " + valorVenda);
        if (valorVenda <= 1000) {
            double commissão5 = valorVenda * 0.05;
            System.out.println("Sua comissão foi de " + commissão5 +" Pois você vendeu menos que 1000");
        } else if (valorVenda >= 1000 && valorVenda <= 5000) {
            double commissão10 = valorVenda * 0.10;
            System.out.println("Sua comissão foi de " + commissão10 +" Pois você vendeu entre 1000 a 5000");
        } else if (valorVenda > 5000) {
            double commissão15 = valorVenda * 0.15 ;
            System.out.println("Sua comissão foi de " + commissão15 +" Pois você vendeu mais que 5000");
        }
    }

}
