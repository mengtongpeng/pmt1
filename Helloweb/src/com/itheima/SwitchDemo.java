package com.itheima;

public class SwitchDemo {
    public static void main(String[] args) {
        int a=2;
        switch (a){
            case 1:{
                System.out.println("今天星期一");
            }
            case 2:{
                System.out.println("今天星期二");
            }
            case 3:{
                System.out.println("今天星期三");
            }
            default:{
                System.out.println("忘记了");
                break;
            }
        }
    }
}
