package com.tailvt2004110014.tuan04.lab4;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        
        ArrayList a = new ArrayList<>();
        a.add("Tài");
        a.add (true);
        a.add(1);
        a.add(2.5);
        Integer x = (Integer)a.get(2);
        for(Object object: a){
            System.out.println(a);
        }

        ArrayList<String>DstenSV = new ArrayList<String>();
        DstenSV.add("Tài");
        DstenSV.add("Tin");
        DstenSV.add("Tú");
        DstenSV.add("Tèo");
        String s = DstenSV.get(3);
        System.out.println(s);
    }
}
