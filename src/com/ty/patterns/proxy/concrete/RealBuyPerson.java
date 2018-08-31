package com.ty.patterns.proxy.concrete;

import com.ty.patterns.proxy.Person;

public class RealBuyPerson extends Person {

    @Override
    public void BuyProduct() {
        System.out.println("帮我买一个IPhone和一台苹果电脑");
    }
}
