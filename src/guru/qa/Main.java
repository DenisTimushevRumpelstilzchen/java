package guru.qa;

public class Main {

    public static void main(String[] args) {
        // домашнее задание 4. Основы Java. Дмитрий Тучс. от 05 апреля 2022 г.

        char symbol, anotherSymbol;
        symbol = 'w';
        boolean flag = false;
        byte aByte = 123;
        short aShort;
        int aInt = aByte;
        long aLong = 123L;
        float aFloat = 1.2F;
        double aDouble = 1.2D;

        String aString = "Hello!";
        String aString0 = new String("Hello!");

        getMaxIntNumber();
        System.out.println(summ(aByte, (int) aLong));
    }


    static void getMaxIntNumber() {
        System.out.println("max value: " + Integer.MAX_VALUE);
    }

    static int summ(int first, int second) {
        return first + second;
    }
}
