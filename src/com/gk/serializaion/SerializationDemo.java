package com.gk.serializaion;

import java.io.*;
import java.util.Stack;
import java.util.Vector;

public class SerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
         A a = new B("Ganesh");
        System.out.println(a.hashCode());
        FileOutputStream fileOutputStream = new FileOutputStream(new File("./serialization.ser"));
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
        outputStream.writeObject(a);
        outputStream.flush();
        System.out.println("Write object in file");

        FileInputStream fileInputStream = new FileInputStream(new File("./serialization.ser"));
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        A aa = (A) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println("a hashcode : "+a.hashCode()+" aa hashcode: "+aa.hashCode());
        System.out.println("name :: "+aa.getName());
        Vector v;
        Stack s;
    }
}
