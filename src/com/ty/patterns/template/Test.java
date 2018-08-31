package com.ty.patterns.template;

import com.ty.patterns.template.concreteclass.CoffeeWithHook;
import com.ty.patterns.template.concreteclass.Tea;

public class Test {

    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.prepareRecipe();

        CoffeeWithHook coffeeHook = new CoffeeWithHook();
        coffeeHook.prepareRecipe();
    }
}
