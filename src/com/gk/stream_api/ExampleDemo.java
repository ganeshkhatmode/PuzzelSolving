package com.gk.stream_api;

public class ExampleDemo {
    public static void main(String[] args) {
        Example example = a -> a%2==0;
        if(example.isEvenNumber(23)) {
            System.out.println("Is even number");
        } else {
            System.out.println("Not even number");
        }

        StringUtil stringUtil = name -> name.toUpperCase();
        String uppercaseName = stringUtil.getNameUppercase("Ganesh digambar khatmode");
        System.out.println("Name :: "+uppercaseName);
    }
}
