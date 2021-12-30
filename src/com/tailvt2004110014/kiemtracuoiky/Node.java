package com.tailvt2004110014.kiemtracuoiky;

public class Node{
    HangHoa data;
    Node next;
    
    public Node(){
        data = null;
        next = null;
    }

    public Node(HangHoa hanghoa){
        data = hanghoa;
        next = null;
    }

    public Node(HangHoa hanghoa, Node node){
        data = hanghoa;
        next = node;
    }

}
