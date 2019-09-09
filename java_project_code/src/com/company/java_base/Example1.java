package com.company.java_base;
import java.util.Scanner;


//public class Example1 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("请输入年份：");
//        long year = scan.nextLong();
//        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//            System.out.println(year + "年是闰年");
//        } else {
//            System.out.println(year + "年不是闰年");
//        }
//    }
//}
//
//
//class Volume{
//    public static void main(String[] args){
//        Scanner scan1 =new Scanner(System.in);
//        System.out.println("请输入半径：");
//        double r = scan1.nextDouble();
//        final double PI = 3.14159;
//        double volume = 4/3*PI*r*r*r;
//        System.out.println("球的体积为："+volume);
//
//    }
//}

//class MoveMultiply{
//    public static void main(String[] args){
//        int x1 = 21;
//        int x2 = 16;
//        int x = 21<<(4);
//        System.out.println(x);
//
//    }
//}

//class TwoCompare{
//    public static void main(String[] args){
//        Scanner scan2 = new Scanner(System.in);
//        System.out.println("请输入第一个数：");
//        float floatNum3 = scan2.nextFloat();
//        Scanner scan3 = new Scanner(System.in);
//        float floatNum4 = scan3.nextFloat();
//        String x = floatNum3==floatNum4?"数值相等":"数值不相等";
//        float x1 = floatNum3>floatNum4?floatNum3:floatNum4;
//
//        System.out.println(x);
//        System.out.println(x1);
//    }
//}
//
//class GradeCompare{
//    public static void main(String[] args){
//        Scanner grade = new Scanner(System.in);
//        System.out.println("输入成绩：");
//        float gradenum = grade.nextFloat();
//        if(gradenum>=90){
//            System.out.println("成绩优秀");
//        }
//        else if(gradenum>=80){
//            System.out.println("成绩良好");}
//        else if(gradenum>=60){
//            System.out.println("成绩一般");}
//        else if(gradenum<60){
//            System.out.println("成绩较差");
//        };
//
//    }
//
//}
//
//class Week_num{
//    public static void main(String[] args){
//        Scanner num = new Scanner(System.in);
//        System.out.println("输入成绩：");
//        int week_num = num.nextInt();
//        switch (week_num){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//        }
//
//    }
//
//}

//class CheckLogin{
//    public static void main(String[] args){
//        Scanner username = new Scanner(System.in);
//        System.out.println("输入用户名：");
//        String username1 = username.next();
//        Scanner password = new Scanner(System.in);
//        System.out.println("输入密码：");
//        String password1 = password.next();
//        if(!username1.equals("mr")){
//            System.out.println("用户名错误");
//        }
//        else if(!password1.equals("mr123")){
//            System.out.println("密码错误");
//        }
//        else{
//            System.out.println("登录成功");
//        };
//
//    }
//}


//while

//class AddNum{
//    public static void main(String[] args){
//        int i=1;
//        int sum=0;
//        while (i<=100){
//            sum=sum+i;
//            ++i;
//        }
//        System.out.println("输入sum的值:"+sum);
//    }
//
//}


//do while

//class Cycle{
//    public static void main(String[] args){
//        int a =1;
//        int sum=0;
//        do{
//
//            sum+=a;
//            a++;
//            System.out.println("sum的值："+sum);
//        }
//        while(a==100);
//        System.out.println("sum的值："+sum);
//    }
//
//
//}


//for循环

//class Cyclefor{
//    public static void main(String[] args){
//        int sum=0;
//        for(int i=1;i<=100;i++){
//            sum=sum+i;
//        }
//        System.out.println("sum的值："+sum);
//    }
//
//
//}

//foreach

//class Cyclefor2{
//    public static void main(String[] args){
//        int arr[]={1,2,3,4};
//        for(int x:arr){
//            x++;
//            System.out.println("x的值："+x+"\t");
//        }
//
//    }
//}

//class CyclefWhile{
//    public static void main(String[] args){
//        String[] string1 = new String[]{"耐克","阿迪","李宁","鬼冢虎","亚瑟士","彪马"};
//
//        for(int index=0;index<string1.length;){
//            System.out.println(string1[index++]+"  ");
//        }
//
//    }
//}

class NineNine1{
    public static void main(String[] args){
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" * "+j+" = "+j*i+"\t");
            }
            System.out.println("\t");
        }


    }
}

// break 可用于for、while、do while中
// continue 只能运用于while、do while中

class AddNum1{
    public static void main(String[] args){
        int i=1;
        int sum=0;
        while (i<=100){
            sum=sum+i;
            if(sum>2000){
                break;
            }
            ++i;
        }
        System.out.println("输入sum的值:"+sum);
    }

}

class AddNum2{
    public static void main(String[] args){
        int i=1;
        int sum=0;
        while (i<=100){
            sum=sum+i;
            if(sum%10==0){
                continue;
            }
            ++i;
        }
        System.out.println("输入sum的值:"+sum);
    }

}

//117 {"白鹭","丹顶鹤","黄鹂","鹦鹉","乌鸦","喜鹊","老鹰","布谷鸟","老鹰","百灵鸟"}

//{{67,78,63,22,66},{55,68,78,44},{95,97,92,93,81}}

class classwork{
    public static void main(String[] args){
        String[] string2 =new String[]{"白鹭","丹顶鹤","黄鹂","鹦鹉","乌鸦","喜鹊","老鹰","布谷鸟","老鹰","百灵鸟"};
        System.out.println("\n"+"所有动物名字:");
        for(int i=0;i<string2.length;i++){
            if(string2[i]=="老鹰"){
                break;
            }
            System.out.println(string2[i]);}

         int[][] string3 = new int[][]{{67,78,63,22,66},{55,68,78,44},{95,97,92,93,81}};
         System.out.println("128班此次考试成绩："+"\n数学\t语文\t英语\t物理\t化学\t");
         NO1:for(int[] i1:string3) {
                for(int i2:i1){
                    System.out.print(i2+"\t");
                    if(i2<60){
                        System.out.println("\n等等"+i2+"分数是什么？为什么这么低");
                        break NO1;
                    }
         }
             System.out.println();
         }

    }

}
