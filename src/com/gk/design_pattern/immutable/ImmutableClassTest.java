package com.gk.design_pattern.immutable;

import java.time.LocalDate;

public class ImmutableClassTest {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        Bill bill = new Bill(1000, now);
        System.out.println(bill +" "+bill.hashCode());
        Bill bill1 = bill.addAmount(1000);
        System.out.println(bill1 +" "+bill1.hashCode());
        if(bill==bill1){
            System.out.println("Object are same");
        } else {
            System.out.println("Object not same");
        }
    }
}
