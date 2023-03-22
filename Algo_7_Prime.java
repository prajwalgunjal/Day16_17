package com.bridgelabz;

public class Algo_7_Prime {
    static int num=0;
    void prime() {
        System.out.println("Printing prime numbers between 0-1000 ");

        int count=0;
        for (int i = 2; i < 1000; i++) {
             num = i;
             print();
        }
    }
    void print(){
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.print(num + " ");

        }
    }

    public static void main(String[] args) {
    Algo_7_Prime algo7Prime = new Algo_7_Prime();
    algo7Prime.prime();
    }
}
