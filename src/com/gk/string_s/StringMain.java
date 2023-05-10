package com.gk.string_s;

public class StringMain {
    public static void main(String[] args) {
        String a = "abc";

        String aa = new String("abc");
        System.out.println("----- STRING Equal == Operator ------");
        if( a == aa) {
            System.out.println("String is ==");
        } else {
            System.out.println("Not equal == string");
        }
        System.out.println("------ String equals() method ------");
        if( a.equals(new String("abc"))){
            System.out.println("String is equal");
        } else {
            System.out.println("String not equal");
        }
        System.out.println("------------ StringBuilder == operator --------");
        StringBuilder builder = new StringBuilder("abc");
        StringBuilder builder1 = new StringBuilder("abc");
        if(builder == builder1) {
            System.out.println("builder object are same");
        } else {
            System.out.println("builder object not same...");
        }
        if(builder.equals(builder1)) {
            System.out.println("builder equals() methods object same");
        } else {
            System.out.println("builder equals() methods object not same");
        }

        StringBuilder stringBuilder = new StringBuilder("ganeshkhatmode");
        StringBuilder deleteStr = stringBuilder.delete(6, stringBuilder.length());
        System.out.println(deleteStr);
        String newStr = stringBuilder.substring(5, stringBuilder.length());

        String a2  = "abc";
        String a3 = a2.substring(1,a2.length()-1);
        System.out.println(a3);
    }
}
