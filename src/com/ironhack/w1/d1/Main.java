package com.ironhack.w1.d1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //================Primitive Data Types==================================
        //=====only primitive data types starts with a lower case letter========

        byte myByte = 127; //stores whole numbers from -128 to 127
        short myShort = 1000; //stores whole numbers from -32768 to 32767
        int myInt = 99999; //stores whole numbers from -2,147,483,648 to 2,147,483,647
        long myLong = 5000000000L; //stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float myFloat = 1.234f; //stores fractional numbers up to 6 to 7 decimals
        double myDouble = 3.456; //stores fractional numbers up to 15 decimals
        boolean myBoolean = true; //stores true or false values
        char myChar = 'a'; //stores a single character letter or ASCII values (see google for ASCII)

        System.out.println("myByte: " + myByte);
        System.out.println("myShort: " + myShort);
        System.out.println("myInt: " + myInt);
        System.out.println("myLong: " + myLong);
        System.out.println("myFloat: " + myFloat);
        System.out.println("myDouble: " + myDouble);
        System.out.println("myBoolean: " + myBoolean);
        System.out.println("myChar: " + myChar);

        //how to change a variable?
        myInt = 1234;
        System.out.println("myNewInt: " + myInt);

//       ==================STRINGS (Not Primitive Data Type)=========================
        //=====only Non-primitive data types starts with an upper case letter========
        String myString = "Hello to everyone!";
        System.out.println(myString);

//       ========== OPERATORS ==========
        int number = 10;
        double doubleNumber = 10;

        System.out.println(number + 5);
        System.out.println(number - 5);
        System.out.println(number * 5);
        System.out.println(number / 5); //this will give us a whole number, not decimals
        System.out.println(doubleNumber / 3); //this will give us with decimal numbers
        System.out.println(number % 3); //This is the module operation and give us the reminder of the division

//        ========= CONDITIONALS ==========
        number = 5000;

//        //*****IF STATEMENTS******
//        if (number == 0) {
//            System.out.println("Number is equal to 0");
//        }
//
//        //******IF ELSE*****
//        if (number == 0) {
//            System.out.println("Number is equal to 0");
//        }else {
//            System.out.println("Number is different than 0");
//        }

        //****IF, ELSE IF, ELSE********
//        if (number == 0) {
//            System.out.println("Number is equal to 0");
//        } else if (number >= 100 && number <= 1000) {
//            System.out.println("Number is bigger than 100 and lest or equal than 1000");
//        } else {
//            System.out.println("Number has another value");
//        }

        //Check if a number has a least 2 digits
        if (number >= 10 || number <= -10) {
            System.out.println("number has a least 2 digits");
        }

        //check if a number is even or not
        if (number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        boolean myCondition = true;

        if (myCondition) System.out.println("condition is true");
        else System.out.println("conditions is false");

        //******SWITCH STATEMENT*******

        int day = 4;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.printf("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
                break;
        }

        //*******TERNARY OPERATOR********

        double grade = 6.5;

        boolean hasPassed = grade >= 5 ? true : false;
        System.out.println(hasPassed);

        String status = grade >= 5 ? "passed" : "failed";
        System.out.println(status);


        //*******Calling Methods*******
        myMethod();
        myMethod();

        //store the returning value of the method in a variable
        String info = getInfo();
        System.out.println(info);

        //this is for the method with parameters
        String infoParameters = getInfo2(10);
        System.out.println(infoParameters);

        //==========STRING METHODS===========

        String address = "Fake Street, 123";
        System.out.println("Address: " + address);
        System.out.println("The address length is: " + address.length());
        // You can research this in google by looking for java string methods and looks for the W3 school info.
        System.out.println(address.toUpperCase());
        System.out.println(address.replace("e", "-"));
        System.out.println(address.toUpperCase().replace("E", "-"));

        //To compare 2 strings we use .equals() string method.
        String address2 = "Fake Street, 123";

        if(address.equals(address2)) System.out.println("They are the same address");
        else System.out.println("They are different address");


        //===========WRAPPERS==========

        //With a primitive data types we don't have methods available (.toUpper())
        //You can research in google  JAva Wrapper and each primitive data type has a wrapper.
        //This is an example that is not working:
        //       int myNum = 100;
        //       myNum.toUpper();
        //this is how we use them
        Integer myNum = 100;
        System.out.println(myNum);

    }

    //==========METHODS==========
    //this method is not returning anything
    public static void myMethod() {
        System.out.println("This ");
        System.out.println("is");
        System.out.println("Inside");
        System.out.println("myMethod");
    }

    //this method is returning something
    public static String getInfo() {
        return "My name is Willy";
    }

    //this methods can accept parameters as well
    public static String getInfo2(int option) {
        if (option == 1) return "My name is Willy";
        else if (option == 2) return "This is an Ironhack bootcamp";
        else return "Option " + option + " provides no info";
    }

}