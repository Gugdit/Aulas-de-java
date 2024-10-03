package exemplos;

public class exemplo3 {
    public static void main(String[] args) {
        int soma = funcaoComParametrosComRetorno(2,2);
        System.out.println(soma);

    }
    public static int funcaoComParametrosComRetorno (int parametro1, int parametro2) {
        return parametro1 + parametro2;
    }
}
