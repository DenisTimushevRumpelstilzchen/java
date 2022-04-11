package guru.qa;

public class Main {

    public static void main(String[] args) {
        // домашнее задание 4. Основы Java. Дмитрий Тучс. от 05 апреля 2022 г.

        char symbol, anotherSymbol;
        symbol = 'w';
        boolean flag = false;
        byte aByte = 127;
        short aShort;
        int aInt = aByte;
        int bInt = 11;
        Integer boxed = null;
        long aLong = 123L;
        float aFloat = 1.2F;
        double aDouble = 1.2;
        String aString = "Pushkin";
        String aString0 = "Pushkin";

        // арифметика
        System.out.println(aByte);
        System.out.println(aInt + bInt);
        System.out.println(aInt - bInt);
        System.out.println(aInt * bInt);
        System.out.println(aLong / aInt);
        System.out.println(aLong % aInt);
        System.out.println();

        String start, middle, end, res;
        start = "Когда-нибудь";
        middle = " я смогу выучить";
        end = " всё это и понять.";
        res = start + middle + end;
        System.out.println(res);
        System.out.println();

        System.out.println("+aDouble = " + +aDouble);
        System.out.println("-aDouble = " + -aDouble);
        System.out.println("aDouble = " + ++aDouble);
        System.out.println("aDouble = " + --aDouble);
        System.out.println(aDouble++);
        System.out.println(aDouble);
        System.out.println(++aDouble);
        System.out.println();

        int februaryDays = 29;
        String result;
        result =  (februaryDays == 28) ? "Не високосный год" : "Високосный год";
        System.out.println(result);
        System.out.println();

        int number1 = 1, number2 = 2, number3 = 9;
        boolean resul;
        resul = (number1 > number2) || (number3 > number1);
        System.out.println(resul);
        resul = (number1 > number2) && (number3 > number1);
        System.out.println(resul);
        System.out.println();

        // перевыполнения
        System.out.println((++aByte) + 20);
        System.out.println((--aByte) + 20);
        System.out.println(aByte++);
        System.out.println(aByte);

    }
}
