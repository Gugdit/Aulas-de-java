public class exercicio10 {
    public static void main(String[] args) {
        System.out.println("--------------------Exercício 10: Conversão de moedas--------------------");
        double valorreais = 2123.0;
        int codigomoeda = 1;
        System.out.println("Escolha um código para a moeda a ser convertida, 1-Dólar, 2-Euro, 3-Libra ");
        System.out.println("Seu codigo é " +codigomoeda);
        switch (codigomoeda) {
            case 1:
                double dólares= valorreais * 0.18;
                System.out.println("Você escolheu dólares seus " + valorreais +" é igual á: "+ dólares +" Dólares");
                break;
            case 2:
                double euros = valorreais * 0.16;
                System.out.println("Você escolheu euros seus " + valorreais +" é igual á: "+ euros +" Euros");
                break;
            case 3:
                double libras = valorreais * 0.14;
                System.out.println("Você escolheu libras seus " + valorreais +" é igual á: "+ libras +" Libras");
                break;
            default:
                System.out.println("Esse código não existe, escolha outro.");

        }
    }
}
