package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class Algo_6_Anagram {
static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("ENter String 1 : ");
        String str1 =sc.next().toLowerCase();
        System.out.println("Enter string 2: ");
        String str2=sc.next().toLowerCase();
//        System.out.println(str1);
//        System.out.println(str2);
        // compare size
        if(str1.length()==str2.length())
        {
            // conver string to array
            char char1[] =str1.toCharArray();
            char char2[] =str2.toCharArray();

            Arrays.sort(char1);
            Arrays.sort(char2);

            String sorted1=new String(char1);
            String sorted2=new String(char2);

        if(sorted1.equals(sorted2)){
            System.out.println("String is anagram");
        }
        else
            System.out.println("not anagram");
        }
    }
}
