public class Senai {
    public static void main(String[] args) {
        System.out.println("Olá Mundo");
        int anoNasc = 2007;
        double peso = 60.0;
        char sexo = 'M';
        double altura = 1.70;

        System.out.println("Ano de Nascimento: " + anoNasc);
        System.out.println("Peso: " + peso);
        System.out.println("Sexo: " + sexo);
        System.out.println("Altura: " + altura);

        boolean teste = false;
        System.out.println(teste);

        int caracter = 200000;

        System.out.println(caracter);

        long l = 1000000000;

        int x = 10, y = 5;
        var r= x + y;

        r = x + y;
        System.out.println(x + "+" + y + "=" + r);
        r = x - y;
        System.out.println(x + "-" + y + "=" + r);
        r = x * y;
        System.out.println(x + "*" + y + "=" + r);
        r = x / y;
        System.out.println(x + "/" + y + "=" + r);
        r = x % y;
        System.out.println(x + "%" + y + "=" + r);

        boolean comparacao;
        comparacao = 5 == 5;
        System.out.println("5 == 5 -> " + comparacao);

        comparacao = 5 != 5;
        System.out.println("5 != 5 -> " + comparacao);

        comparacao = 5 > 5;
        System.out.println("5 > 5 -> " + comparacao);

        comparacao = 5 < 5;
        System.out.println("5 < 5 -> " + comparacao);

        comparacao = 5 <= 5;
        System.out.println("5 <= 5 -> " + comparacao);

        comparacao = 5 >= 5;
        System.out.println("5 >= 5 -> " + comparacao);

        int resultado = 2;
        System.out.println("-----------------------------operadores especiais-----------------------------");
        System.out.println("o valor inicial de resultado é " + resultado);

        resultado++;
        System.out.println("resultado++ " + resultado);

        resultado--;
        System.out.println("resultado-- " + resultado);

        resultado+=3;
        System.out.println("resultado+= " + resultado);

        resultado-=2;
        System.out.println("resultado-= " + resultado);

        resultado*=3;
        System.out.println("resultado*= " + resultado);

        resultado/=4;
        System.out.println("resultado/= " + resultado);





    }
}
