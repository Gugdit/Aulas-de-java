package Aula04.exemplos;

public class Exemplos {
        public static void main(String[] args) {
            //Aula dia 10/09/2024

            System.out.println("Exemplo 1");
            int x = 20;
            char espaco = 32;

            if (x > 30) {
                System.out.println("É maior que 30.");
            } else {
                System.out.println("É menor que 30.");
            }
            System.out.println(espaco);
            System.out.println("Exemplo 2");

            String corSemaforo = "Vermelho";

            if (corSemaforo == "verde") {
                System.out.println("Siga, o farol está " + corSemaforo + ".");
            } else {
                if (corSemaforo == "amarelo") {
                    System.out.println("Atenção, o farol está " + corSemaforo + ".");
                } else {
                    if (corSemaforo == "vermelho") {
                        System.out.println("Pare, o farol está " + corSemaforo + ".");
                    } else {
                        System.out.println(corSemaforo + " é uma cor inválida.");
                    }
                }
            }

            System.out.println(espaco);
            System.out.println("Exemplo 2.1");

            if (corSemaforo == "verde" || corSemaforo == "Verde") {
                System.out.println("Siga, o farol está " + corSemaforo + ".");
            } else if (corSemaforo == "amarelo" || corSemaforo == "Amarelo") {
                System.out.println("Atenção, o farol está " + corSemaforo + ".");
            } else if (corSemaforo == "vermelho" || corSemaforo == "Vermelho" || corSemaforo == "vermelha" || corSemaforo == "Vermelha") {
                System.out.println("Pare, o farol está " + corSemaforo + ".");
            } else {
                System.out.println(corSemaforo + " é uma cor inválida.");
            }

            System.out.println(espaco);
            System.out.println("Exemplo 3");

            int idade = 16;

            if (idade > 0 && idade <= 12) {
                System.out.println("Você tem " + idade + " anos e se encaixa na categoria criança.");
            } else if (idade >= 13 && idade < 18) {
                System.out.println("Você tem " + idade + " anos e se encaixa na categoria adolescente.");
            } else if (idade >= 18 && idade < 65) {
                System.out.println("Você tem " + idade + " anos e se encaixa na categoria adulto.");
            } else if (idade >= 65) {
                System.out.println("Você tem " + idade + " anos e se encaixa na categoria idoso.");
            } else {
                System.out.println(idade + " valor inválido.");
            }

            System.out.println(espaco);
            System.out.println("Exemplo 4");

            x = 30;
            boolean r;
            r = x >= 30 ? true : false;
            System.out.println(r);

            System.out.println(espaco);
            System.out.println("Exemplo 5");

            idade = 10;
            String maioridade;
            maioridade =  idade>18 ? "maior de idade." : "menor de idade.";
            System.out.println("Você tem " + idade + " anos e você é " + maioridade);

            System.out.println(espaco);
            System.out.println("Exemplo 6");

            float preco = 70;
            float desconto;
            desconto = preco>80 ? 0.25f : 0;
            System.out.println("Você tem direito á " + (desconto*100) + "% de desconto em compras acima de 80 reais.\n" + "Você fez uma compra no total de = " + preco + " reais." + "\nSeu valor da compra com desconto final = " + (preco - preco*desconto) + " reais.");

            System.out.println(espaco);
            System.out.println("Exemplo 7");

            corSemaforo = "amarelo";

            switch (corSemaforo) {
                case "verde":
                    System.out.println("Siga! " + corSemaforo);
                    break;
                case "amarelo":
                    System.out.println("Atenção! " + corSemaforo);
                    break;
                case "vermelho":
                    System.out.println("Pare! " + corSemaforo);
                    break;
                default:
                    System.out.println("Cor inválida!! " + corSemaforo);
            }
            System.out.println("------------------------Cardápio------------------------");
            System.out.println("Escolha a comida que voçê quer pedir");
            System.out.println("Digite 1 para pizza");
            System.out.println("Digite 2 para pastel");
            System.out.println("Digite 3 para esfira");
            int escolhadocliente = 4;
            System.out.println("  ");
            System.out.println(escolhadocliente);
            System.out.println("   ");
            switch (escolhadocliente){
                case 1:
                    System.out.println("Iremos enviar seu pastel");
                    break;
                case 2:
                    System.out.println("Iremos enviar sua esfira");
                    break;
                case 3:
                    System.out.println("Iremos enviar sua pizza");
                    break;
                default:
                    System.out.println("Não temos isso aqui, por favor peça outra coisa.");

            }

        }
}
