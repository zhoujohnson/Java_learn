package com.company.java_regular;

//// 检查输入的数据是否满足某周格式，语法： boolean matches(String regex)
//元字符     正则表达式中的写法     含义
//.          "."                   表示任意字符
//\d         "\\d"                 代表0~9的任何一个数字
//\D         "\\D"                 代表任何一个非数字字符
//\s         "\\s"                 代表空白字符，如"\t","\n"
//\S         "\\s"                 代表非空白字符
//\w         "\\w"                 代表可用作标识符的字符，但不包括$
//\W         "\\W"                 代表不可用于标识符的字符
//\p{Lower}  "\\p{Lower}"          代表小写字母{a~z}
//\p{Upper}  "\\p{Upper}"          代表大写字符{A~Z}
//\p{ASCII}  "\\p{ASCII}"          代表ASCII字符
//\p{Alpha}  "\\p{Alpha}"          代表字母字符
//\p{Digit}  "\\p{Digit}"          代表十进制数字，即[0-9]
//\p{Alnum}  "\\p{Alnum}"          代表数字或字母字符
//\p{Punct}  "\\p{Punct}"          代表标点符号：!""#$%&''()+,-./:;<=>?@[\]^_`{|}``~
//\p{Graph}  "\\p{Graph}"          代表可见字符[\p{Alnum}\p{Punct}]
//\p{Print}  "\\p{Print}"          代表可打印字符：[\p{Graph}\x20]
//\p{Blank}  "\\p{Blank}"          代表空格或制表符：[\t]
//\p{Catrl}  "\\p{Catrl}"          代表控制字符：[\x00-\x1F\x7F]




public class regular_operate {
    public static void main(String[] args){
        String s1 = "Mrkj007";
        String s2 = "mrkj007";
// 老方法
//        boolean bn1 = s1.matches("\\p{Upper}\\p{Lower}\\p{Lower}\\p{Lower}\\d\\d\\d");
//        boolean bn2 = s2.matches("\\p{Upper}\\p{Lower}\\p{Lower}\\p{Lower}\\d\\d\\d");
// 新方法
        boolean bn1 = s1.matches("\\p{Upper}\\p{Lower}{3}\\d{3}");
        boolean bn2 = s2.matches("\\p{Upper}\\p{Lower}{3}\\d{3}");
        System.out.println(s1+"是合法数据吗？"+bn1);
        System.out.println(s2+"是合法数据吗？"+bn2);
    }
}

class Judge{
    public static void main(String[] args){
        String regex = "\\w{0,}\\@\\w{0,}\\.{1}\\w{0,}";
        String str1 = "aaa@";
        String str2 = "aaa";
        String str3 = "aaa@111.com";
        if(str1.matches(regex)){
            System.out.println(str1+"是一个Email地址格式");
    }
        if(str2.matches(regex)){
            System.out.println(str2+"是一个Email地址格式");
        }
        if(str3.matches(regex)){
            System.out.println(str3+"是一个Email地址格式");
        }
        else {
            System.out.println("都不是Email地址格式");
        }
        }
}

// 元字符含义
// [abc]    表示a,b,c
// [^abc]   表示a,b,c外任意字符
// [a-zA-Z]     a~z或A~Z的任何字符
// [a-d[m-p]]   a~d或m~p的任何字符
// [a-z&&[def]  d，e或者f
// [a-z&&[^bc]]     a~z之间不含b和c的所有字符
// [a-z&&[^m-p]]    a~z之间不含m~p的所有字符


class CheckPhoneNum{
    public static void main(String[] args){
        String telephone1 = "11024588795";
        String telephone2 = "15011111111";
        System.out.println(check(telephone1));
        System.out.println(check(telephone2));
    }
    public static String check(String handset){
        String regex = "1[3,5,8]\\d{9}$";
        if(handset.matches(regex)){
            return handset +"\n是合法的手机号";
        }else{
            return handset +"\n不是是合法的手机号";
        }
    }

}





