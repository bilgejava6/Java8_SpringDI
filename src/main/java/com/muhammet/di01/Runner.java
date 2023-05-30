package com.muhammet.di01;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("çıktı türü...: [E/S] ");
        if(sc.nextLine().equals("E"))
            System.err.println("Merhaba Arkadaşlar");
        else
            System.out.println("Merhaba Arkadaşlar");
    }
}
