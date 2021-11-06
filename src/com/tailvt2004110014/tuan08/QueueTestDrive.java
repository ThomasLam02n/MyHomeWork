package com.tailvt2004110014.tuan08;

public class QueueTestDrive {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(10, "Nguyễn A");
        queue.add(8, "Nguyễn B");
        NodeSinhVien temp;
        temp= queue.peek();
        temp.inthongtin();
        queue.print();
        System.out.println("Lấy ra");
        temp= queue.remove();
        temp.inthongtin();;
        System.out.println("Lấy ra");
        temp=queue.remove();
        temp.inthongtin();
    }
}
