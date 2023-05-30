package com.muhammet.di03;

public class B {
    A a;
    public B(){
        a= new A();
    }

    @Deprecated
    public void print(){
        System.out.println(a.getMessage());
    }

    public void printErr(){
        System.err.println(a.getErrorMessage());
    }

}
