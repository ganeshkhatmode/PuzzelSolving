package com.gk.polymorphisam;

public class DeriDerived extends Derived{
    DeriDerived(){
        System.out.println("Deriderived");
    }

    public static void main(String[] args) {
        Base b = new DeriDerived();
    }
}
