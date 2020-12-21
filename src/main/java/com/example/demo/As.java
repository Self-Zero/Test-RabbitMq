package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class As {

    public static void main(String[] args) {
        // 测试源
        List<String> sourceList = new ArrayList<>();
        for (int i = 0;i<10000;i++) {
            sourceList.add("第" + i + "条数据");
        }
        System.out.println("数据条数：" + sourceList.size());

        long a1=System.currentTimeMillis();
        for (int i = 0;i < sourceList.size();i++) doSome();
        long a2=System.currentTimeMillis();
        System.out.println("普通for循环用时：" + (a2-a1));

        long b1=System.currentTimeMillis();
        for (String t:sourceList) doSome();
        long b2=System.currentTimeMillis();
        System.out.println("增强for循环用时：" + (b2-b1));

        long c1=System.currentTimeMillis();
        sourceList.forEach((t)-> doSome());
        long c2=System.currentTimeMillis();
        System.out.println("forEach循环用时：" + (c2-c1));

        long d1=System.currentTimeMillis();
        sourceList.parallelStream().forEach((t)-> doSome());
        long d2=System.currentTimeMillis();
        System.out.println("forEach-Stream循环用时：" + (d2-d1));
    }


    private static void doSome() {
        try {
            Thread.sleep(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
