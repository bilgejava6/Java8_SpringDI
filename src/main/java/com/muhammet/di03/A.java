package com.muhammet.di03;

public class A {
    private String message = "Güncellenecek";

    /**
     * 3. sürümden sonra bu method devredış kalcaktır. yeni kullanımlarına bakınız.
     * getStandartMessage, getErrorMessage
     * @return
     */
    @Deprecated
    public String getMessage(){
        return message;
    }

    public String getStandardMessage(){
        return "Standard "+ message;
    }
    public String getErrorMessage(){
        return "Error "+ message;
    }



}
