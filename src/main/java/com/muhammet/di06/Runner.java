package com.muhammet.di06;
public class Runner {
    public static void main(String[] args) {
        IPrinter printer = MyFramework.getInstance()
                .getPrinterInstance(
                        "com.muhammet.di06.ErrorPrinter",
                        "com.muhammet.di06.MessageProviderTR");

        printer.print();

    }
}
