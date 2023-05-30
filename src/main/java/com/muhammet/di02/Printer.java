package com.muhammet.di02;

public class Printer {

    public void print(PrintType type){
        switch (type){
            case ERROR -> System.err.println("Merhaba");
            case STANDARD -> System.out.println("Merhaba");
            default -> System.out.println("Merhaba Default ");
        }
    }
}
