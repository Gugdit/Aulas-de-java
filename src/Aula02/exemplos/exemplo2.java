package Aula02.exemplos;

public class exemplo2 {
    public static void main(String[] args) {
        long numLong = 100;
        int numInt = 10;
        byte numByte = 120;
        short numShort = 9;

        //casting implicito
        numLong = numInt;
        numInt = numShort;
        numShort = numByte;
        numLong = numByte;
        numLong = numShort;

        //casting explicito
        numByte = (byte) 150;
        numShort = (short) 150;

        System.out.println(numByte);
        System.out.println(numShort);

        numInt = (int) 32.45f;

        System.out.println(numInt);

        float numFloat = 150.0F;
        double numDouble = 215.320;
        numDouble = numFloat;

        numFloat = (float) numDouble;

        System.out.println(numFloat);
        numFloat = (float) 100000000000000000000000000000000000000000000.86;
        System.out.println(numFloat);




    }
}