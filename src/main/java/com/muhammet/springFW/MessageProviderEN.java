package com.muhammet.springFW;

public class MessageProviderEN implements IProvider {
    @Override
    public String getMessage() {
        return "I am sending a message in Turkish.";
    }
}
