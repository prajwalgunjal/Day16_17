package com.bridgelabz.DSAProgram_1_unordered;
import java.util.Scanner;
public class LinkedListMain<T> {
    static String str ="Hello this is prajwal gunjal. ";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> linkedList=new LinkedList<>();
        String[] wordArray = str.split(" ");
        for(int i=0;i<wordArray.length;i++) {
            linkedList.addData(wordArray[i]);
        }
        linkedList.display();
        System.out.println();
        while(true){
            System.out.println();
        System.out.print("Enter a word to check weather it is present or not:-");
        String word = sc.next();
        linkedList.search(word);
        linkedList.display();
        }
    }
}
