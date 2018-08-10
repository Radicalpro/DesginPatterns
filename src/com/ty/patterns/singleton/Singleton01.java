package com.ty.patterns.singleton;

/**
 * 懒汉 线程不安全
 */
public class Singleton01 {

    /**
     * 利用静态变量来记录Singleton的唯一实例
     */
    private static Singleton01 uniqueInstance;

    /**
     * 构造器私有化，只有Singleton类内才可以调用构造器
     */
    private Singleton01() {

    }

    public static Singleton01 getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton01();
        }

        return uniqueInstance;
    }
}
