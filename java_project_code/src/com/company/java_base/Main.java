package com.company.java_base;

import java.util.Scanner;

//整数类型

//class Number{
//    public static void main(String[] args){
//        byte mybyte=124;
//        short myshort = 32564;
//        int myint=45233345;
//        long mylong=33456543L;
//        long result=mybyte+myshort+myint+mylong;
//        System.out.println("四种类型相加的结果为："+result);
//    }
//}

//浮点类型
//class SumNumber{
//    public static void main(String[] args){
//        float f1=13.23f;
//        double d1=4562.12d;
//        double d2=45678.243;
//        double result=f1+d1+d2;
//        System.out.println("浮点型相加达到结果为："+result);
//    }
//}

//字符类型

//class MyChar{
//    public static void main(String[] args){
//        int i='d';
//        char c=98;
//        System.out.println("字符串d的Unicode码是"+i);
//        System.out.println("Unicode码97代表的字符是"+c);
//    }
//}

//class Gess{
//    public static void main(String[] args){
//        char char1='\\';
//        char char2='\u2605';
//        System.out.println("输出反斜杠："+char1);
//        System.out.println("输出五角星："+char2);
//    }
//}

//布尔类型（boolean)

//class MyBoolean{
//    public static void main(String[] args){
//        boolean b1=true,b2=false,b3;
//        System.out.println("做布尔运算"+b1);
//    }
//}

//变量与常量
//定义变量
//int age;
//char char1='r';

//声明常量

//final double PI=3.1415926F;
//final boolean BOOL=true;

//注意：如果常量属于“成员变量”,必须在定义时就付给初始值，否则编译时会出错


//例：
//class Part{
//    static final double PI=3.14;
//    static int age=23;
//    public static void main(String[] args){
//        final int number;
//        number=1235;
//        age =22;
//        System.out.println("变量PI值为"+PI);
//        System.out.println("赋值后number的值为："+number);
//        System.out.println("int型变量age的值为："+age);
//    }
//}

// 1.变量分为“成员变量”和“局部变量”
// 成员变量又分为静态变量和实例变量，静态变量的有效范围可以跨类，除了能定义
// 它的类内存取，还能直接以“类名.静态变量”的方式在其他类使用

// 2.局部变量，在类方法体中定义的变量，只能在当前代码块有效
// 局部变量的生命周期取决于方法，当方法被调用，Java虚拟机为方法中的局部变量分配
// 内存空间，当该方法的调用结束后，则会释放方法中局部变量占用的内存空间，局部变量
// 也随机销毁

//class Val{
//    static int times=3;
//    public static void main(String[] args){
//        int times=4;
//        System.out.println("times的值为："+times);
//        System.out.println("times的值为："+Val.times);
//    }
//}
//
//class Calc{
//    static int a,b,c;
//    public static void main(String[] args){
//        a=15;
//        b=c=a+4;
//        System.out.println(c);
//        System.out.println(b);
//    }
//
//}

//Java中算术运算符主要有“+，-，*，/，%”

//class Arith{
//    public static void main(String[] args){
//        float number1 = 45.56f;
//        int number2= 152;
//        System.out.println("45.56f和152的和为："+number1+number2);
//        System.out.println("45.56f和152的差为："+(number1-number2));
//        System.out.println("45.56f和152的积为："+number1*number2);
//        System.out.println("45.56f和152的商为："+number1/number2);
//        System.out.println("45.56f和152的余为："+number1%number2);
//    }
//}

//自增和自减运算符
//++a(--a)    // 表示在使用变量a之前，先使a的值加（减）1
//a++(a--)      //表示在使用变量a之后，使a的值加（减）1

//class Runaddself{
//    public static void main(String[] args){
//        int a=4;
//        int b=++a;
//        int c=a++;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//    }
//
//}

//比较运算符  “>,<,>=,<=,==,!=”

//class Compare{
//    public static void main(String[] args){
//        int number1=4;
//        int number2=5;
//        System.out.println(number1>number2);
//        System.out.println(number1<number2);
//        System.out.println(number1==number2);
//        System.out.println(number1!=number2);
//
//    }
//}

//逻辑运算符  “&&（&），||（|），！”
// 注意:“&”表示两个表达式都为true时，才判断为true,“&&”表示第一个为false
//时，直接判断为false，通过从左端到右端直接判断称为“短路”，“&&”为“短路”
//运算符，“&”为“非短路”，“|”和“||”也是如此

//class Calc2{
//    public static void main(String[] args){
//        int a=2;
//        int b=3;
//        boolean result1=((a>b)&&(a!=b));
//        boolean result2=((a>b)||(a!=b));
//        System.out.println(result1);
//        System.out.println(result2);
//    }
//
//
//}

//位运算 “~（按位取反），&（按位与），|（按位或），^（按位异或），<<（左移）>>（右移）（））”

//class Calc3{
//    public static void main(String[] args){
//        int i = 46;
//        int j = 97;
//        System.out.println("46&97的值是："+(i&j));
//        System.out.println("46^97的值是："+(i^j));
//        System.out.println("46右移一位的值是："+(i>>1));
//
//    }
//
//}

//三元运算符
//三元运算符为Java中唯一一个三目运算符  boolean b= 20<45?true:false;
//boolean a;
//if(20<45)
//    a = true;
//else
//    a = false

//class Calc4{
//    public static void main(String[] args){
//        int i = 46;
//        int j = 97;
//        int x = i<j?100:200;
//        System.out.println(x);
//
//    }
//
//}
//
//class VariableExchange{
//    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("请输入变量A的值");
//        long A = scan.nextLong();
//        System.out.println("请输入变量B的值：");
//        long B = scan.nextLong();
//        System.out.println("A="+A+" B="+B);
//        System.out.println("执行变量变换...");
//        A=A^B;
//        System.out.println(A);
//        B=B^A;
//        System.out.println(B);
//        A=A^B;
//        System.out.println(A);
//        System.out.println("A="+A+" B="+B);
//
//    }
//
//}

//class ParityCheck{
//    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("输入一个整数：");
//        Long number = scan.nextLong();
//        String check = (number%2==0)?"这个数为偶数":"这个数为奇数";
//        System.out.println(check);
//
//    }
//}

//自动类型转换

//class AutoTypeExchange{
//    public static void main(String[] args){
//        float number1 = 45f;
//        int number2 = 152;
//        System.out.println(number1+number2);
//    }
//}

//class Cover{
//    public static void main(String[] args){
//        byte mybyte = 127;
//        int myint =150;
//        float myfloat = 452.12f;
//        char mychar = 10;
//        double mydouble = 45.46546;
//        System.out.println("127与452相加的和是："+(mybyte+myfloat));
//        System.out.println("127与150相乘的积是："+mybyte*myint);
//        System.out.println("127被10除的商是："+mybyte/mychar);
//        System.out.println("45.465465和10相加的和是："+(mydouble+mychar));
//    }
//}

//强制类型转换
//boolean型不能转换为其他数据类型

//class Cover1{
//    public static void main(String[] args){
//        int a = (int)45.23;
//        long y =(long)456.6F;
//        int b=(int)'d';
//        System.out.println(a);
//        System.out.println(y);
//        System.out.println(b);
//
//    }
//}
//
//class TypeConvertion{
//    public static void main(String[] args){
//        int intNum = 4;
//        float floatNum = 9.5F;
//
//        floatNum/=intNum;
//        System.out.println("9.5除以4的商是："+floatNum);
//
//        double doubleNum1 = 12.345;
//        double doubleNum2 = 15.322;
//        int doubleNum3 = (int)(doubleNum1)+(int)doubleNum2;
//        System.out.println("强制类型转换"+doubleNum3);
//
//        char charNum = 'c';
//        int intNum1 = (int)charNum;
//        System.out.println("char转int:"+intNum1);
//
//        int intNum3 = 37;
//        double doubleNum4 = (double)intNum/3;
//        System.out.println("int类型转换为double类型："+doubleNum4);
//    }
//}

class Xiagao{
    public static void main(String[] args){
        int[] s = new int[]{1,3,5,7,9,11,13,15,17,19};
        int sum=0;
        for(int i=0;i<10;i++) {
            System.out.print(s[i]);
            sum=sum+s[i];
            if(i==9){
                System.out.print(" =");
            }
            else{

                System.out.print(" + ");
            }
        }
        System.out.print(sum);

    }

}