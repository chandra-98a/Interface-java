package com.capgemini.connect;

public class DataBaseApp {
    public static void main(String [] args){

        Oracle o=new Oracle();
        Informix i=new Informix();
        SyBase s=new SyBase();
        Database db=new Database();
                db.allowConnection(o);
                db.allowConnection(i);
                db.allowConnection(s);
    }
}
