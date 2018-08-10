package com.ty.patterns.singleton;

/**
 * 双重检查加锁--减少同步使用提高效率
 */
public class Singleton04 {
    /**
     * 利用静态变量来记录Singleton的唯一实例
     * volatile 关键字确保：当uniqueInstance变量被初始化成Singleton实例时，
     * 多个线程正确地处理uniqueInstance变量
     */
    private volatile static Singleton04 uniqueInstance;

    /**
     * 构造器私有化，只有Singleton类内才可以调用构造器
     */
    private Singleton04() {

    }

    /**
     * 检查实例，如果不存在，就进入同步区域
     */
    public static Singleton04 getInstance() {
        if (uniqueInstance == null) {
            //进入同步区域
            synchronized (Singleton04.class) {
                //在检查一次，如果为null，则创建
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton04();
                }
            }
        }

        return uniqueInstance;
    }
}
