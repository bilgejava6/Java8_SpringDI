package com.muhammet.di04;

public class StandartPrinter implements IPrinter{
    private IProvider provider;
    @Override
    public void setProvider(IProvider provider) {
        this.provider=provider;
    }
    @Override
    public void print() {
        System.out.println(provider.getMessage());
    }
}
