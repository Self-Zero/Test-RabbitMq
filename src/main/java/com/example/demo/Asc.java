package com.example.demo;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Asc {

    private static volatile Asc asc = null;

    private Asc(){}

    private static Asc getAsc(){
        if (asc == null){
            synchronized (Asc.class){
                if (asc == null){
                    asc = new Asc();
                }
            }
        }
        return asc;
    }

    public static void main(String[] args) {
        /*long a = System.currentTimeMillis();
        for (int i = 0; i<200; i++){
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("-----------------------:"+Asc.getAsc().hashCode());
            }
        }).start();
        }
        long b = System.currentTimeMillis();
        System.out.println("多线程执行的时间是:"+(b-a));*/
        // Scanner input = new Scanner(System.in);
        /*List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }*/

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        List linkedList = new LinkedList();
        linkedList.add(2);
        linkedList.add(6);
        linkedList.add(5);
        linkedList.add(2);
        System.out.println(linkedList);
        System.out.println(linkedList.size());

        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.get(3));
        for (int i = 0;i<linkedList.size();i++){
            System.out.println((linkedList.get(i)).equals(a));
            if ((linkedList.get(i)).equals(a)){
                linkedList.remove(i);
            }
        }
        System.out.println(linkedList);
    }




}
