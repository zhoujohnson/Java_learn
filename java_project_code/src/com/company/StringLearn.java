package com.company;
import java.util.StringTokenizer;

//class StringLearn {
//    public static void main(String[] args){
//        char a[]={'a','b','c','d'};
//        String s=new String(a,2,3);
//        System.out.print(s.length());
//    }
//}

class StringLearn1{
    public static void main(String[] args){
        String s1="   Java class  ";
        String s2=s1.trim();
        System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println(s2);
    }
}

class StringTo{
    public static void main(String[] args){
        String text="   We are Champions  ";
        System.out.println("原字符串是："+text);
        StringTokenizer st = new StringTokenizer(text," ");
        StringBuffer sb = new StringBuffer();
        int i=1;
        while(st.hasMoreTokens()){
            i++;
            sb.append(st.nextToken());
        }
        System.out.println("去掉字符串中所有空格"+sb.toString());
        System.out.println(i);

    }

}

class StringTo1{
    public static void main(String[] args){
        String s = " J A V A 编 程 字 典";
        s = s.replaceAll(" ","");
        System.out.println("去除空格后的字符串为："+s);

    }
}



class Stringreplace {
    public static void main(String[] args){
        String old = " bad bad study";
        old = old.replace("bad", "good");
        System.out.println("替换后的字符串是：" + old);
    }
}





class Stringreplace1{
    public static void main(String[] args){
        String s = "bad bad study";
        s = s.replaceFirst("bad","good");
        System.out.println("替换后的字符串是："+s);
        }

}

class StringEquals{
    public static void main(String[] args){
        String s = "bad bad study";
        boolean b1 = s.equals("bad bad study");
        System.out.println("比较后的字符串是："+b1);
    }

}

// equals and equalsIgnoreCase 1 判断字符串是否相等  2 判断长度和字符是否一致
class StringEquals1{
    public static void main(String[] args){
        String s = "bad bad study";
        String s1="bad Bad study";
        boolean b1 = s.equals("bad bad study");
        boolean b2 = s.equalsIgnoreCase(s1);
        System.out.println("比较后的字符串是："+b1);
        System.out.println("比较后的字符串是："+b2);
    }

}


//startsWith()方法 and endsWith()   判断字符串的开始与结尾

class StringStartsAndEnds{
    public static void main(String[] args){
        String num = "21123413";
        String num1 = "22233444";

        boolean b1 = num.startsWith("21");
        boolean b2 = num1.startsWith("21");
        boolean b3 = num.endsWith("13");
        boolean b4 = num1.endsWith("13");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
    }
}

// toLowerCase() and toUpperCase()

class StringLowerUpper{
    public static void main(String[] args){
        String s = "aGc";
        String news1 = s.toLowerCase();
        String news2 = s.toUpperCase();
        System.out.println(news1);
        System.out.println(news2);
    }

}

// split(String sign,int limit) 方法  字符串分割

class StringSplit{
    public static void main(String[] args){
        String s = "I,love,you,mom";
        String[] newSplit =s.split(",",3);
        for(int i=0;i<newSplit.length;i++){
            System.out.print(newSplit[i]+" ");
        }
    }
}


