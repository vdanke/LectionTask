package org.step.inheritance;

public class BaseCourse extends Course {

    private volatile String myString;
    public static String publicStr;
    transient final String defaultString = "";

    public BaseCourse() {
    }

    public BaseCourse(String myString) {
        this.myString = myString;
    }

    @Override
    public void inject(String str) {

    }

    public static String getString(Integer integer) {
        return Integer.toString(integer);
    }
}
