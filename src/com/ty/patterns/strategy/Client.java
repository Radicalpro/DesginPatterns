package com.ty.patterns.strategy;

import com.ty.patterns.strategy.concretestratyegy.SelectSort;
import com.ty.patterns.strategy.handle.ArrayHandler;
import com.ty.patterns.strategy.strategy.Sort;

public class Client {

    public static void main(String args[]) {
        int arr[] = {1, 4, 6, 2, 5, 3, 7, 10, 9};
        int result[];

        ArrayHandler ah = new ArrayHandler();
        //使用选择排序
        Sort sort = new SelectSort();
        //设置具体策略
        ah.setSortObj(sort);
        result = ah.sort(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + ",");
        }
    }
}
