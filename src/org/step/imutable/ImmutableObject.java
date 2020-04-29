package org.step.imutable;

public class ImmutableObject {

    public static void main(String[] args) {
        String oldString = "abc";
        String newString = "abc";
        Integer good = 123;

        String str = "This is my string ";

        str = changeObject(str);

        System.out.println(str);

        boolean isTrue = oldString == newString;
        boolean isEquals = str.equals(oldString);
        boolean isFalse = str == oldString;

        System.out.println(isTrue);
        System.out.println(isEquals);
        System.out.println(isFalse);
    }

    private static String changeObject(String str) {
        return str + "Are u sure?";
    }
}
