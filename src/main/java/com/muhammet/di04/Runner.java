package com.muhammet.di04;

public class Runner {

    public static void main(String[] args) {
        /**
         * System.out.println("merhaba");
         * - printer type
         * - message
         * -----------------------------
         * -- Interface PrinterType
         * -- Interface Message
         * -------------
         * NOT:  Yazdırma işlemi için 2 bileleşen gerekli
         * 1- mesaj, 2- tür
         * -- IPrinter
         * -- IProvider
         */
        IProvider provider=null;
        IPrinter printer=null;

        provider  = new MessageProviderTR();
        printer = new ErrorPrinter();

        printer.setProvider(provider);
        printer.print();
    }
}
