package com.company;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class FormatExample {
    public static void main(String[] args){
        Date today = new Date();
        String a = String.format(Locale.US,"%tb",today);
        String b = String.format(Locale.US,"%tB",today);
        String c = String.format(Locale.US,"%ta",today);
        String d = String.format(Locale.US,"%tA",today);
        String e = String.format(Locale.US,"%tY",today);
        String f = String.format(Locale.US,"%ty",today);
        String g = String.format(Locale.US,"%tm",today);
        String h = String.format(Locale.US,"%td",today);
        String i = String.format("%te",today);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);

    }
}


class GetTime{
    public static void main(String[] args){
        Date date = new Date();
        System.out.println("默认时间格式:  "+date);
        System.out.println(String.format("%tH",date));
        System.out.println(String.format("%tl",date));
        System.out.println(String.format("%tk",date));
        System.out.println(String.format("%tL",date));
        System.out.println(String.format("%tM",date));
        System.out.println(String.format("%tS",date));
        System.out.println(String.format("%tZ",date));
        System.out.println(String.format("%tp",date));
    }
}

class DateAndTime2{
    public static void main(String[] args){
        Date date = new Date();
        System.out.println("默认时间格式:  "+date);
        System.out.println(String.format("%tR",date));
        System.out.println(String.format("%tT",date));
        System.out.println(String.format("%tr",date));
        System.out.println(String.format("%tD",date));
        System.out.println(String.format("%tF",date));
        System.out.println(String.format("%tc",date));
    }
}

// 将金额格式化成大写

//class CovertMoney{
//    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("请输入一个数字");
//        String convert  = convert(scan.nextDouble());
//        System.out.println(convert);
//
//    }
//    public static String convert(double d){
//        DecimalFormat df = new DecimalFormat("#0.###");
//        String strNum = df.format(d);
//        if(strNum.indexOf(".")!=-1){
//            String num = strNum.substring(0,strNum.indexOf("."));
//            if(num.length()>12){
//                System.out.println("数字太大，不能完成转换！");
//                return "";
//            }
//        }
//        String point = "";
//        if(strNum.indexOf(".")!=-1){
//            point="元";
//        }else {
//            point="元整";
//        }
//        String result = getInteger(strNum)+point + getDecimal(strNum);
//        if(result.startsWith("元")){
//            result=result.substring(1,result.length());
//        }
//        return result;
//    }
//    public static String getInteger(String num){
//        if(num.indexOf(".")!=-1){
//            num = num.substring(0,num.indexOf("."));
//        }
//        num = new StringBuffer(num).reverse().toString();
//        StringBuffer temp = new StringBuffer();
//        for(int i = 0;i<num.length();i++){
//            temp.append(STR_UNIT[i]);
//            temp.append(STR_NUMBER[num.charAt(i)-48]);
//        }
//        num = temp.reverse().toString();
//        num = numReplace(num,"零拾","零");
//        num = numReplece(num,"零佰","零");
//        num = numReplece(num,"零仟","零");
//        num = numReplece(num,"零万","万");
//        num = numReplece(num,"零亿","亿");
//        num = numReplece(num,"零零","零");
//        num = numReplece(num,"亿万","亿");
//        if(num.lastIndexOf("零")==num.length()-1){
//            num = num.substring(0,num.length()-1);
//        }
//        return num;
//    }
//}

