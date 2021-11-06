package com.tailvt2004110014.tuan09;

public class selectionsort {
    public static void main(String[] args) {
        int arr[] = { 5, 6, 3, 9, 1, 2, 4, 8, 7 };
        sapxeptangdan(arr);
    }

    public static void sapxeptangdan(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;

                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        System.out.println("Sắp xếp tăng dần:");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
