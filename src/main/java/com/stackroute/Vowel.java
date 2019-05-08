package com.stackroute;

import java.util.Scanner;

public class Vowel
{
    public static void main(String[] args)
    {
        String original, stringnew;
        System.out.println("enter the string");
        Scanner scan = new Scanner(System.in);
        original = scan.nextLine();
        System.out.println("Actual string is " + original);
        //replace the vowel by space and print remaining
        stringnew = original.replaceAll("[aeiou]", "");
        System.out.println("string is "  + stringnew);
    }
}
