package com.tailvt2004110014.tuan08;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemoProgram {
    public static void main(String[] args) {

        Queue<Integer> queue;

        queue = new LinkedList<>();

        queue.add(8);
        queue.add(10);
        queue.add(3);

        System.out.println(queue);

        //Lấy ra một phần tử trong queue ( lấy từ đầu)
        int phanTuLayRa = queue.remove();

        System.out.println("Phần tử được lấy ra từ queue: "+phanTuLayRa);
        System.out.println("Phần tử còn lại: \n"+queue);

        //Thăm 1 phần tử trong queue ( nhưng không xoá ra khỏi queue)
        int thamPhanTu = queue.peek();

        System.out.println("Phần tử được thăm: "+thamPhanTu);
        System.out.println("Phần tử còn lại: "+queue);
    }
}
