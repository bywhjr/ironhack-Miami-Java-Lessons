package com.ironhack.w1.d2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Week 1 day 2 lessons");

//        ==========ARRAYS========

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(days);
        System.out.println(Arrays.toString(days)); //This prints the whole array
        System.out.println(days[0]); // this is how we get elements in the array
        System.out.println(days.length); // This shows us how many elements we have
        System.out.println(days[days.length -1]); //This is how we get the last element in the array

        String[] subjectArray = createSubjectsArray();

        System.out.println(Arrays.toString(subjectArray));
    }

    public static String[] createSubjectsArray(){
        String[] subjects = new String[5]; // This we created an empty array with 5 spaces.
        subjects[0] = "Math"; //this is how we add objects to the empty array
        subjects[1] = "Language";
        subjects[2] = "History";
        subjects[3] = "Biology";
        subjects[4] = "Chemestry";

        return subjects;

    }
}
