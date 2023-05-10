package com.gk;

public class SingletonClass {
     static SingletonClass singletonClass=null;

    private SingletonClass() {}

    private static SingletonClass getInstance(){
        synchronized (singletonClass) {
            if (singletonClass == null)
                return new SingletonClass();
        }
        return singletonClass;
    }
}
