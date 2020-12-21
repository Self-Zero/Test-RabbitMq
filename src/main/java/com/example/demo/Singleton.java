package com.example.demo;

public class Singleton {

    private Singleton(){}

    private static volatile Singleton singleton = null;

    private static Singleton getInstance(){
        if (singleton == null){
            synchronized (Singleton.class){
                if (singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        for (int i = 0; i<200; i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+":"+Singleton.getInstance().hashCode());
                }
            }).start();
        }
        long b = System.currentTimeMillis();
        System.out.println("多线程执行的时间是:"+(b-a));
    }
}
