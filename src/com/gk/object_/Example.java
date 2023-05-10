package com.gk.object_;

import java.io.Closeable;
import java.io.IOException;

public class Example implements Closeable {

    private String type;
    private int count;

    public Example(String type, int count) {
        this.type = type;
        this.count = count;
        System.out.println("Create Example object");
    }

    @Override
    public void close() throws IOException {
        System.out.println("Close Example object");
    }
}
