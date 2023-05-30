package com.muhammet.di05;


import java.io.FileInputStream;
import java.util.Properties;

public class FactoryBuilder implements IFactory{
    /**
     * 1- static nedir?
     * 2- static{
     *
     * } Nedir?
     *
     * 3- {
     *
     * } nedir?
     *
     * 4- constructor nedir?
     * bunlar hangi sıra ile çalışırlar?
     */
    private IPrinter printer;
    private IProvider provider;
    private static FactoryBuilder instance;
    static {
        if(instance == null)
            instance = new FactoryBuilder();
    }
    public static FactoryBuilder getInstance(){
        return instance;
    }

    private Properties properties;

    {
        properties = new Properties();
        try{
            properties.load(new FileInputStream("E:\\BILGEADAM_DATAS\\BOOST_JAVA_8\\INTELLIJ\\Springframework\\SpringDI\\src\\main\\java\\com\\muhammet\\di05\\application.properties"));
            String providerClass = properties.getProperty("provider");
            String printerClass = properties.getProperty("printer");
            provider = (IProvider) Class.forName(providerClass)
                    .getDeclaredConstructor().newInstance();
            printer = (IPrinter) Class.forName(printerClass)
                    .getDeclaredConstructor().newInstance();
        }catch (Exception exception){
            System.out.println("Beklenmeye hata...: "+ exception.getMessage());
        }
    }



    @Override
    public IProvider getProvider() {
        return this.provider;
    }

    @Override
    public IPrinter getPrinter() {
        return this.printer;
    }
}
