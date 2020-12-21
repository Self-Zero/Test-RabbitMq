package com.example.demo;

import java.util.Scanner;

public class demo {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
           demo.a();
    }


    static void a(){
        System.out.println("============================================================");
        System.out.println("               恒基美佳后台登陆中心");
        System.out.print("            用户名:");
        String usercode = scanner.nextLine();
        System.out.print("            密  码:");
        String pwd = scanner.nextLine();
        System.out.println("============================================================");
        login(usercode,pwd);
    }

    static void login(String usercode,String pwd){
        if (usercode.equals("admin") && pwd.equals("admin")){
            System.out.println("欢迎"+usercode+"进入后台官网！！");
            message();
            System.out.println("============================================================");
        }else {
            System.out.println("                请输入正确的用户名密码！！");
            a();
        }

    }
    static void message(){
        System.out.println("您有XX条消息需要处理");
        System.out.println("请问现在处理吗?(y/n)");
        String choose = scanner.nextLine();
        switch (choose){
            case "y":
                System.out.println(1);
                break;
            case "n":
                System.out.println(3);
                break;
            default:
                System.out.println(2);
                break;
        }
    }
    /*System.out.println("");*/
}
