package com.capgemini.connect;

public class SyBase implements Connection{
    @Override
    public void connect() {
        System.out.println("Connecting to SyBase database");
    }
    @Override
    public void query(){
        System.out.println("Querying SyBase database");
    }

    @Override
    public void close() {
        System.out.println("closing SyBase database");
    }
}
