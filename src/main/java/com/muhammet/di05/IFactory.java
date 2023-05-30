package com.muhammet.di05;

import com.muhammet.di05.IPrinter;
import com.muhammet.di05.IProvider;

public interface IFactory {
    IProvider getProvider();
    IPrinter getPrinter();
}
