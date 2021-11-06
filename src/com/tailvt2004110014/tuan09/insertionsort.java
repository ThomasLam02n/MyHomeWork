package com.tailvt2004110014.tuan09;

import java.util.ArrayList;

public class insertionsort {
public static void main(String[] args) {

    int arr[] = {3,5,2,6,8,4};
    sort(arr);

}
    public static void sort(int arr[]){
        int n = arr.length;
        for(int i = 1; i < n; ++i){
            int key = arr[i];
            int j = j = i -1;

            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        for(int i = 1; i < n; i++){
            System.out.println(arr[i]);
        }
    }
}
