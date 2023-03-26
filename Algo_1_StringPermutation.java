package com.bridgelabz;
import java.util.Scanner;

public class Algo_1_StringPermutation {
    public static void main(String[] args) {
        System.out.println("Enter a word to check permutations");
        Scanner sc=new Scanner(System.in);
        String str = sc.next();
        printPermutation(str,"");
    }
    private static void printPermutation(String str, String asf) {
        if (str.length()==0){
            System.out.println(asf);
        }
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            String Str1 = str.substring(0,i);
            String Str2 = str.substring(i+1);
            String Str3 = Str1 + Str2;
            printPermutation(Str3,asf+ch);
        }
    }
}
