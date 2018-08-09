package com.ty.patterns.factorymethod;

import com.ty.patterns.factorymethod.store.ChicagoPizzaStore;
import com.ty.patterns.factorymethod.store.NYPizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {
        System.out.println("---------Joel 需要的芝加哥的深盘披萨---------");
        //建立芝加哥的披萨店
        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        //下订单
        Pizza joelPizza = chicagoPizzaStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + joelPizza.getName() + "\n");
        System.out.println("---------Ethan 需要的纽约风味的披萨---------");
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza ethanPizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + ethanPizza.getName() + "\n");

    }
}
