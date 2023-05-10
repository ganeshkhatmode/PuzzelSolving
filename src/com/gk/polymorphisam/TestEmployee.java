package com.gk.polymorphisam;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new BankEmployee();
        employee.show();
    }
}
