public class exercicio5 {
    public static void main(String[] args) {
        System.out.println("--------------------Exercício 5: Cálculo de horas extras--------------------");
        int horastrabalhadas = 39;
        int horasextras = horastrabalhadas - 40;
        int salarionormalsemhoraextra = horastrabalhadas - horasextras;
        int salariohoranormaltotal = salarionormalsemhoraextra * 20;
        System.out.println("Suas horas trabalhadas foram: " + horastrabalhadas);
        if (horastrabalhadas >= 40) {
            int salarioporhoraextra = horasextras * 30;
            System.out.println("Suas horas extras foram: " + horasextras);
            System.out.println("Seu bônus pelas as horas extras foram: " + salarioporhoraextra);
            int salariototalcomextra = salariohoranormaltotal + salarioporhoraextra;
            System.out.println("Seu sálario total é " + salariototalcomextra);
        } else if (horastrabalhadas <= 40) {
            int salarionormal = salariohoranormaltotal;
            System.out.println("Você não fez hora extra seu sálario é: " + salarionormal);

        }
    }
}
