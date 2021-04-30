package com.company;

public class Main {

    public static void main(String[] args) {

        CompteEpargne c1 = new CompteEpargne(0.5F);
        c1.verser(100);
        c1.calculInterets();
        System.out.println(c1);
    }
}
