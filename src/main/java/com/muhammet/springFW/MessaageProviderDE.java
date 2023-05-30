package com.muhammet.springFW;

public class MessaageProviderDE implements IProvider {
    @Override
    public String getMessage() {
        return "Ich sende eine Nachricht auf Türkisch.";
    }
}
