package com.ty.patterns.proxy;

import com.ty.patterns.proxy.concrete.Friend;

public class Client {

    public static void main(String[] args) {
        // 创建一个代理对象并发出请求
        Person proxy = new Friend();
        proxy.BuyProduct();
    }

}
