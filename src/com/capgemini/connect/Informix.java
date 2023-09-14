package com.capgemini.connect;

public class Informix implements Connection{
    @Override
    public void connect() {
        System.out.println("Connecting to Informix database");
    }
    @Override
    public void query(){
        System.out.println("Querying Informix database");
    }

    @Override
    public void close() {
        System.out.println("closing Informix database");
    }
}
