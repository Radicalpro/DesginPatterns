package com.ty.patterns.proxy.concrete;

import com.ty.patterns.proxy.Person;

public class Friend extends Person {

    /**
     * 引用真实主题实例
     */
    private RealBuyPerson realSubject;

    @Override
    public void BuyProduct() {
        System.out.println("通过代理类访问真实实体对象的方法");
        if (realSubject == null) {
            realSubject = new RealBuyPerson();
        }
        this.PreBuyProduct();
        // 调用真实主题方法
        realSubject.BuyProduct();
        this.PostBuyProduct();
    }

    /**
     * 代理角色执行的一些操作
     */
    public void PreBuyProduct() {
        // 可能不知一个朋友叫这位朋友带东西，首先这位出国的朋友要对每一位朋友要带的东西列一个清单等
        System.out.println("我怕弄糊涂了，需要列一张清单，张三：要带相机，李四：要带Iphone...........");
    }

    /**
     * 买完东西之后，代理角色需要针对每位朋友需要的对买来的东西进行分类
     */
    public void PostBuyProduct() {
        System.out.println("终于买完了，现在要对东西分一下，相机是张三的；Iphone是李四的..........");
    }
}
