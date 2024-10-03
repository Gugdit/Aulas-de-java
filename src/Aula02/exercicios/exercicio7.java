package Aula02.exercicios;

public class exercicio7 {
    public static void main(String[] args) {
        System.out.println("---------------------Exercicio 7: Operadores Lógicos Básicos---------------------");
        boolean cond1 = true;
        boolean cond2 = false;
        boolean cond3 = true;
        boolean condTotal1 =  cond1 && cond2;
        boolean condTotal2 = cond1 && cond3;
        boolean condTotal3 = cond2 && cond3;

        boolean condTotal4 =  cond1 || cond2;
        boolean condTotal5 = cond1 || cond3;
        boolean condTotal6 = cond2 || cond3;

        System.out.println("Quase todas true;");
        System.out.println("condTotal1: " + condTotal1);
        System.out.println("condTotal2: " + condTotal2);
        System.out.println("condTotal3: " + condTotal3);
        System.out.println("          ");
        System.out.println("Todas true;");
        System.out.println("condTotal4: " + condTotal4);
        System.out.println("condTotal5: " + condTotal5);
        System.out.println("condTotal6: " + condTotal6);


    }
}
