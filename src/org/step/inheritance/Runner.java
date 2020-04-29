package org.step.inheritance;

public class Runner {

    public static void main(String[] args) {
        doLogic(new BaseCourse("My string"));
        doLogic(new OptionalCourse());
        doLogic(new FreeCourse());
        doLogic(new OtherCourse());

        BaseCourse baseCourse = new BaseCourse();
        String str = BaseCourse.getString(132);
        String publicStr = BaseCourse.publicStr;
        System.out.println(str);
    }

    public static void doLogic(Course course) {
        if (course instanceof BaseCourse) {
            System.out.println("Base Course");
        } else if (course instanceof OptionalCourse) {
            System.out.println("Optional Course");
        } else {
            System.out.println("Other course");
        }
    }
}
