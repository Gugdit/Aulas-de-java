public class exercicio9 {
    public static void main(String[] args) {
        System.out.println("--------------------Exercício 9: Determinação de turno--------------------");
        System.out.println("Os turnos são, 1-Manhã (5 às 12), 2-Tarde (12 às 18), 3-Noite (18 às 22), 4-Madrugada (22 às 5)");
        int horáriododia = -123;
        System.out.println("O horário do dia é " + horáriododia);
        if (horáriododia >= 5 && horáriododia <= 12) {
            System.out.println("Seu turno é Manhã");
        } else if (horáriododia >= 13 && horáriododia <= 18) {
            System.out.println("Seu turno é Tarde");
        } else if (horáriododia >= 19 && horáriododia <= 22) {
            System.out.println("Seu turno é Noite");
        } else if (horáriododia >= 23 && horáriododia <= 5) {
            System.out.println("Seu turno é Madrugada");
        } else {
            System.out.println("Esse número não está dentro dos parâmetros, escolha outro.");
        }
    }
}
