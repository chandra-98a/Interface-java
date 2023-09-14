package com.capgemini.connect;

public class Oracle implements Connection{
    @Override
    public void connect() {
        System.out.println("Connecting to oracle database");
    }
    @Override
    public void query(){
        System.out.println("Querying oracle database");
    }

    @Override
    public void close() {
        System.out.println("closing oracle database");
    }
}
