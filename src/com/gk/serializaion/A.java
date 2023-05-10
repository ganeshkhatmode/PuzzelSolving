package com.gk.serializaion;

import java.io.Serializable;
import java.util.Objects;

public class A implements Serializable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public A(String name) {
        this.name = name;
    }

//    public A() {
//        System.out.println("Initialize default constructor");
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return Objects.equals(name, a.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
