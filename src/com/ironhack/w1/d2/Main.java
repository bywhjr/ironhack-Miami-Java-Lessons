package com.ironhack.w1.d2;

import jdk.dynalink.beans.StaticClass;

import java.lang.reflect.Array;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

//        =============================LOOPS================================

//        =====FOR LOOPS=====

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
        }

        for (int i = 0; i < subjectArray.length; i++) {
            System.out.println(i + ": " + subjectArray[i]);
        }

        int[] evenNumbers = new int[51];
        int j = 0;
        for (int i = 0; i < 100; i++){
            if (i % 2 == 0){
                evenNumbers[j] = i;
                j++;
            }
        }

//        ===========foreach Loop===========

        for (String subject : subjectArray){
            System.out.println(subject);
        }

//        ===========while loop=============
        int counter =0;

        while (counter < 10){
            System.out.println("Counter: " + counter + " - This is a while loop");
            counter++;
        }

//        ==========do while loop===================
//        this will execute at least one time

        counter = 100;
        do{
            System.out.println("counter: " + counter + " - This is a do while loop.");
            counter++;
        }while (counter < 110);

//        =======Array List====
//        this is an order collection of data

        List<String>countries = new ArrayList<>();

        countries.add("USA"); //Add elements
        countries.add("Spain");
        countries.add("France");
        System.out.println(countries);
        System.out.println(countries.get(0)); //get the item in position 0
        countries.set(2, "Italy"); // this replaced an item in the list
        System.out.println(countries);
        System.out.println(countries.size()); // get the size of the list
        countries.remove(2); //remove items
        System.out.println(countries);

        //iterate trough an listarray

        for (int i = 0; i < countries.size(); i++){
            System.out.println(countries.get(i));
        }

//        ADD ELEMENTS TO AN ARRAY

        int[] numbers = {0, 1, 2, 3, 4};
//        numbers[5] = 5; //this can not be done with an array

        int[] newNumbers = new int[6];
        for (int i = 0; i < numbers.length; i++){
            newNumbers[i] = numbers[i];
        }
        newNumbers[5] = 5;


//        MATH CLASS & CASTING CLASSES

        System.out.println(Math.sqrt(64)); //square rout
        System.out.println(Math.pow(2, 5)); //this returns the power of a number as a double
        System.out.println((int)Math.pow(2, 5));//this returns the power of a number as an int
        System.out.println(Math.ceil(3.75)); //round a number to the closes number
    }

    public static String getCountry(int index){
        List<String>countries = new ArrayList<>();

        countries.add("USA"); //Add elements
        countries.add("Spain");
        countries.add("France");

        return countries.get(index);
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
