package com.tailvt2004110014.tuan09;

public class TimKiemNhiPhan {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int n = arr.length;
        int x = 7;
        int result = timkiemnhiphan(arr, x);
        if (result == -1)
            System.out.println("ko tìm thấy ");
        else {
            System.out.println("Đã tìm thấy tại vị trí: " + result);
        }
    }

    static int timkiemnhiphan(int arr[], int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = 1 + (r - 1) / 2;
            if (arr[m] == x)
                return m;

            if (arr[m] < x){
                l = m + 1;
            }else
                r = m - 1;
        }
        return -1;
    }
}
