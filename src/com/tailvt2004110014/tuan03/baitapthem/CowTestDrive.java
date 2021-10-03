package com.tailvt2004110014.tuan03.baitapthem;

public class CowTestDrive {
    public static void main(String[] args) {
        Cow cow;
        cow = new Cow(15, "Tây Ban Nha", "Đen");
        System.out.println("\nCân nặng: " + cow.weight +" \nGiống: " + cow.breed +" \nMàu: " + cow.color);
    }
}
