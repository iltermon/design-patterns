package com.iltermon.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton.hashCode());
        System.out.println(singleton2.hashCode());
    }
}
