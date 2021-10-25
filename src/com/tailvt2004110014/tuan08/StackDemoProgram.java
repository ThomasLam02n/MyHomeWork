package com.tailvt2004110014.tuan08;

import java.util.Stack;

public class StackDemoProgram {
    public static void main(String[] args) {

        Stack<String> stack;
        stack = new Stack<>();

        //Đẩy vào 1 phần tử
        stack.push("Welcom");
        stack.push("to");
        stack.push("VN");

        System.out.println(stack);

        //Xoá 1 phần tử (từ đỉnh đến đáy)
        String poped = stack.pop();

        System.out.println("Phần tử đã xoá từ stack: "+poped);
        System.out.println("Phần tử còn lại của stack: \n" +stack);

        //Thăm phần tử đỉnh (Không xoá phần đó ra khỏi stack)
        String phantTuDuocTham = stack.peek();

        System.out.println("Phần tử được thăm: "+phantTuDuocTham);
        System.out.println("Phần tử còn lại: \n"+stack);

        //Đảo ngược stack
        

    }
}
