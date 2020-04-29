package org.step;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {

    Integer i;

    {
        i = 0;
    }

    public static void main(String[] args) {
        MyFirstClass myFirstClass = new MyFirstClass();
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        myFirstClass.say();

        long bigNumber = 10;
        int smallNumber = 10;
        long result = bigNumber + (long) smallNumber;
        long newNumber = smallNumber;

        long min = Math.min(result, newNumber);

        bigNumber += result;
        boolean isValid = bigNumber > smallNumber;

        if (bigNumber > smallNumber || newNumber < bigNumber) {
            if (!isValid && newNumber < bigNumber) {

            }
        }

        long l = isValid ? bigNumber : smallNumber;

        int first = 0;
        byte second = 0;
        short third = 0;
        long fourth = 0;

        float fifth = 0.0f;
        double sixth = 0.0d;

        boolean seventh = true;

        char eighth = 'a';

        String abc = "abc";
        Integer firstInteger = 1;
        Byte firstByte;
        Short firstShort;
        Long firstLong;
        Float firstFloat;
        Double firstDouble;
        Boolean firstBoolean;
        Character character;

        BigInteger bigInteger;
        BigDecimal bigDecimal;
    }
}
