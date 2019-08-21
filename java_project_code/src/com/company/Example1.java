package com.company;
import java.util.Scanner;


public class Example1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入年份：");
        long year = scan.nextLong();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "年是闰年");
        } else {
            System.out.println(year + "年不是闰年");
        }
    }
}


class Volume{
    public static void main(String[] args){
        Scanner scan1 =new Scanner(System.in);
        System.out.println("请输入半径：");
        double r = scan1.nextDouble();
        final double PI = 3.14159;
        double volume = 4/3*PI*r*r*r;
        System.out.println("球的体积为："+volume);

    }
}

//class MoveMultiply{
//    public static void main(String[] args){
//        int x1 = 21;
//        int x2 = 16;
//        int x = 21<<(4);
//        System.out.println(x);
//
//    }
//}

class TwoCompare{
    public static void main(String[] args){
        Scanner scan2 = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        float floatNum3 = scan2.nextFloat();
        Scanner scan3 = new Scanner(System.in);
        float floatNum4 = scan3.nextFloat();
        String x = floatNum3==floatNum4?"数值相等":"数值不相等";
        float x1 = floatNum3>floatNum4?floatNum3:floatNum4;

        System.out.println(x);
        System.out.println(x1);
    }
}