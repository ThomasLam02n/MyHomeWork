package com.tailvt2004110014.tuan07.chuongtrinhlinkedlist;

public class LinkedListTestDrive {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList();
        // myLinkedList.add(2);
        // myLinkedList.add(4);
        // myLinkedList.inDanhSach();
        // myLinkedList.addHead(5);
        // myLinkedList.inDanhSach();
        myLinkedList.addHead(5);
        myLinkedList.addTail(0);
        myLinkedList.addTail(7);
        // myLinkedList.inDanhSach();
        myLinkedList.add(6,0);
        myLinkedList.add(8, 6);
        myLinkedList.inDanhSach();
        // myLinkedList.remove(6);
        // myLinkedList.inDanhSach();
        // myLinkedList.remove(7);
        // myLinkedList.inDanhSach();
        myLinkedList.edit(6, 10);
        myLinkedList.inDanhSach();
        // myLinkedList.removeHead();
        // myLinkedList.inDanhSach();
        // myLinkedList.removeTail();
        // myLinkedList.inDanhSach();
    
    }
}
