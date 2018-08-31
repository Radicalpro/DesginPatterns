package com.ty.patterns.template.abstractclass;

public abstract class CaffeineBeverage {

    /**
     * 模板方法，用来控制泡茶与冲咖啡的流程
     * 申明为final，不希望子类覆盖这个方法，防止更改流程的执行顺序
     */
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    /**
     * 将brew()、addCondiment()声明为抽象类，具体操作由子类实现
     */
    protected abstract void brew();

    protected abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water...");
    }

    void pourInCup() {
        System.out.println("Pouring into Cup...");
    }
}