package com.muhammet.di02;

public class Runner {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print(PrintType.ERROR);
        printer.print(PrintType.STANDARD);

    }
}
