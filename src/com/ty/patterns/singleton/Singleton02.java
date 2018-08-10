package com.ty.patterns.singleton;

/**
 * synchronized锁懒汉
 */
public class Singleton02 {

    /**
     * 利用静态变量来记录Singleton的唯一实例
     */

    private static Singleton02 uniqueInstance;

    /**
     * 构造器私有化，只有Singleton类内才可以调用构造器
     */
    private Singleton02() {

    }

    public static synchronized Singleton02 getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton02();
        }

        return uniqueInstance;
    }
}
