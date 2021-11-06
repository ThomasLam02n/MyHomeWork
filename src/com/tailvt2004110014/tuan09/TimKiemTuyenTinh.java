package com.tailvt2004110014.tuan09;

import javax.naming.spi.DirStateFactory.Result;

public class TimKiemTuyenTinh {
    public static void main(String[] args) {
        int arr[] = {5,3,4,7,2,6,4,2};
        int x = 7;
        int result = search(arr, x);
        if(result == -1)
        System.out.println("ko tìm thấy ");
        else{
            System.out.println("Đã tìm thấy tại vị trí: "+result);
        }
    }
    public static int search(int arr[], int x)
    {
        int n = arr.length;
        for(int i = 0; i < n; i++)
        {
            if(arr[i] == x)
            return i;
        }
        return -1;
    }
}
