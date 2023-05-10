package com.gk.polymorphisam;

public class B extends A {
    private String str = "Inside B class";
    public void show() {
        System.out.println("Inside B class method");
    }

    public static void main(String[] args) {
        A a =  new B();
//        a.show(); //
        System.out.println(a.str);
    }
}
