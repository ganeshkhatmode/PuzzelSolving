package com.gk.collections.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee("gk1", 1000);
        Employee employee2 = new Employee("gk2", 1300);
        Employee employee3 = new Employee("gk3", 8000);
        Employee employee4 = new Employee("gk4", 500);
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        System.out.println(employees);
        List<Employee> sortedEmployee = employees.stream()
                .sorted(Employee::compareTo)
                .collect(Collectors.toList());
        System.out.println(sortedEmployee.get(1));
    }
}
