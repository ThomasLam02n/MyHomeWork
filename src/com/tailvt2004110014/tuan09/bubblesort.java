package com.tailvt2004110014.tuan09;

public class bubblesort {
    public static void main(String[] args) {
        int arr[] = { 5, 1, 12, 14, 16, 12, 2 };
        bubbleSort(arr);
    }

    public static void bubbleSort(int[] arr) {
        int temp = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    // Swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i]);

        }
    }
}
