package com.example.project;

public class FizzBuzz {

    public static boolean isThreeMultiple(int num) {
        return num != 0 && num % 3 == 0;
    }

    public static boolean isFiveMultiple(int num) {
        return num != 0 && num % 5 == 0;
    }

    public static String replaceFizz(int num) {
        if (isThreeMultiple(num)) {
            return "Fizz";
        } else {
            return String.valueOf(num);
        }
    }

    public static String replaceBuzz(int num) {
        if (isFiveMultiple(num)) {
            return "Buzz";
        } else {
            return String.valueOf(num);
        }
    }

    public static boolean isThreeAndFiveMultiple(int num) {
        if (isThreeMultiple(num) && isFiveMultiple(num)) {
            return true;
        }
        return false;
    }

    public static String replaceFizzBuzz(int num) {
        if (isThreeAndFiveMultiple(num)){
            return "FizzBuzz";
        }else {
            return String.valueOf( num);
        }
    }

    public static String fizzBuzz(int i) {
        if (isThreeAndFiveMultiple(i)) {
            return "FizzBuzz";
        }
        if (isThreeMultiple(i)) {
            return "Fizz";
        }
        if (isFiveMultiple(i)) {
            return "Buzz";
        }
        return String.valueOf(i);

    }
}
