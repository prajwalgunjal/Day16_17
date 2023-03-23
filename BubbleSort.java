package com.bridgelabz;

import java.util.Arrays;

public class BubbleSort {

    public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
        int n = arr.length;
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i-1].compareTo(arr[i]) > 0) {
                    // swap arr[i-1] and arr[i]
                    T temp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
            n--;
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {3, 7, 1, 4, 2, 6, 5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
