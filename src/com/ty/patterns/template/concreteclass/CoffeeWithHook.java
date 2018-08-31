package com.ty.patterns.template.concreteclass;

import com.ty.patterns.template.abstractclass.CaffeineBeverageWithHook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {
    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter...");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk...");
    }

    /**
     * 覆盖该钩子，提供自己的实现方法
     */
    @Override
    public boolean customerWantsCondiments() {
        if ("y".equals(getUserInput().toLowerCase())) {
            return true;
        } else {
            return false;
        }
    }

    public String getUserInput() {
        String answer = null;
        System.out.print("Would you like milk and sugar with your coffee(y/n):");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (answer == null) {
            return "n";
        }
        return answer;
    }

}
