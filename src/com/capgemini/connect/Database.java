package com.capgemini.connect;

public class Database {
    void allowConnection(Connection ref){
        ref.connect();
        ref.query();
        ref.close();
    }
}
