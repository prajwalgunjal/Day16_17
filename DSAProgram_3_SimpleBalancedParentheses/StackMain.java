package com.bridgelabz.DSAProgram_3_SimpleBalancedParentheses;

import java.util.Scanner;

public class StackMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
//        System.out.println("Enter expression");
//        String str = sc.next();
        String str = " ( 5 + 6 ) ∗ ( 7 + 8 ) / ( 4 + 3 ) ( 5 + 6 ) ∗ ( 7 + 8 ) / ( 4 + 3 ) ";
        String regex ="\\d+";
        str = str.replaceAll(regex," ");
        System.out.println(str);
//        String regex2 ="\\+";
//        String regex3 ="\\*";
//        String regex4 ="/";

//        System.out.println(str.replaceAll(regex," "));
//        System.out.println(str.replaceAll(regex2," "));
//        System.out.println(str.replaceAll(regex3," "));
//        System.out.println(str.replaceAll(regex4," "));
        String[] strArray= str.split(" ");
        String push ="(";
        String push2 =")";
        for(int i=0;i<strArray.length;i++)
        {
//            System.out.print(strArray[i]+ " ");
            if(strArray[i].equals(push)) {
                stack.push(strArray[i]);
            } else if (strArray[i].equals(push2)) {
                stack.pop(strArray[i]);
            }
        }
        stack.check();
//        linkedList.display();
    }
}
