package guru.qa;

public class Main {

    public static void main(String[] args) {
        // домашнее задание 4. Основы Java. Дмитрий Тучс. от 05 апреля 2022 г.

        char symbol, anotherSymbol;
        symbol = 'w';
        boolean flag = false;
        byte aByte = 1;
        short aShort;
        int aInt = aByte;
        int bInt = 11;
        Integer boxed = null;
        long aLong = 123L;
        float aFloat = 1.2F;
        double aDouble = 1.2D;
        String aString = "Pushkin";
        String aString0 = "Pushkin";

        System.out.println(aByte);
        System.out.println(aInt + bInt);
        System.out.println(aInt - bInt);
        System.out.println(aInt * bInt);
        System.out.println(aInt / bInt);
        System.out.println(aInt % bInt);
        System.out.println();

        String start, middle, end, result;
        start = "Когда-нибудь";
        middle = " я смогу выучить";
        end = " всё это и понять.";
        result = start + middle + end;
        System.out.println(result);
        System.out.println();

        System.out.println("+aDouble = " + +aDouble);
        System.out.println("-aDouble = " + -aDouble);
        System.out.println("aDouble = " + ++aDouble);
        System.out.println("aDouble = " + --aDouble);

    }
}
