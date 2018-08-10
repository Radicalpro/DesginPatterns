package com.ty.patterns.builder;

/**
 * 创建具体的建造者（ConcreteBuilder）:装机人员
 */
public class ConcreteBuilder extends Builder {

    /**
     * 创建产品实例
     */
    Computer computer = new Computer();

    /**
     * 组装产品
     */
    @Override
    public void BuildCPU() {
        computer.Add("组装CPU");
    }

    @Override
    public void BuildMainboard() {
        computer.Add("组装主板");
    }

    @Override
    public void BuildHD() {
        computer.Add("组装主板");
    }

    /**
     * 返回组装成功的电脑
     */
    @Override
    public Computer GetComputer() {
        return computer;
    }
}
