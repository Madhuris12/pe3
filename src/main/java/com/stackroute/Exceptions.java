package com.stackroute;

public class Exceptions {
    public static void main(String[] args) {
        try {
            int[] a = new int[10];
            //Array consists of only 10 elements
            a[11] = 9;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds");
        }


        try {
            String str = null;//String is initialized to null
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException..");
        }


        try {
            int arrSize = -8;//Array is initialized to negative
            int[] myArray = new int[arrSize];
        } catch (NegativeArraySizeException e) {
            System.out.println("Negative array exception");
        }
    }
}

