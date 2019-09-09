package com.company.java_base;

import java.util.Arrays;

//class MinNum {
//    public static void main(String[] args){
//        int[] list1 = new int[]{1,5,2,4,5,8,2,4,5,7,-1};
//        for(int i=0;i<list1.length;i++){
//            System.out.print(list1[i]+"\t");
//        }
//        int j=list1[0];
//        for(int k=0;k<list1.length;k++){
//            if(j>list1[k]){
//                j=list1[k];
//
//            }
//
//        }System.out.println("\n"+j);
//
//
//    }
//}

class Matrix{
    public static void main(String[] args){
        int a[][] =new int[3][4];
        System.out.println("输出3行4列的数组：");
        for(int i=0;i<a.length;i++){
            for(int j=0;i<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}

class Ransack{
    public static void main(String[] args){
        int arr[][][]=new int[][][]{
                {{1,2,3},{4,5,6}},
                {{7,8,9},{10,11,12}},
                {{13,14,15},{16,17,18}}
        };
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
            for(int k=0;k<arr[0][0].length;k++) {
                System.out.print(arr[i][j][k]+"\t");
            }
            System.out.println();
            }
            }
        }

    }


class ArrayRowColumnSwap {
    public static void main(String[] args) {
        int arr[][] = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("转置前的距阵是：");
        printArray(arr);
        int arr2[][] = new int[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr2[j][i] = arr[i][j];
            }
        }
        System.out.println("转置后的距阵是：");
        printArray(arr2);
    } 


    private static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//{31,28,31,30,31,30,31,31,30,31,30,31}

class Getday{
    public static void main(String[] args){
        int[] i = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        for(int x=0;x<i.length;x++){
            System.out.print((x+1)+"月有"+(i[x])+"天"+"\t");
            if((x+1)%3==0){
               System.out.println();
            }
        }
        
    }

}

// fill(int[] a,int value方法，可将指定的int值分配给int 型数组的每个元素

class Swap{
    public static void main(String[] args){
        int arr[] = new int[5];
        Arrays.fill(arr,8);
        for(int i =0;i<arr.length;i++){
            System.out.println("第"+(i+1)+"个元素是"+arr[i]);
        }
    }
}

class Displace{
    public static void main(String[] args){
          int arr[] = new int[]{45,12,2,10,1};
          Arrays.fill(arr,1,3,8);
          for(int i =0;i<arr.length;i++){
              System.out.println(arr[i]);
          }
    }
}

class Taxis{
    public static void main(String[] args){
        int arr[] = new int[]{23,42,12,8,5,10};
        System.out.println("原一维数组是：");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        Arrays.sort(arr);
        System.out.println("\n升序排列后的数组是；");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}

class Copy{
    public static void main(String[] args){
        int arr[] = new int[]{23,42,12};
        System.out.println("复制前的数组是");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        int newarr[] = Arrays.copyOf(arr,20);
        System.out.println("\n 复制后的数组是：");
        for(int i=0;i<newarr.length;i++){
            System.out.print(newarr[i]+" ");
        }
        }
    }


class Repeat{
    public static void main(String[] args){
          int arr[] = new int[]{23,42,12,84,10};
          System.out.println("原来的数组是：");
          for(int i=0;i<arr.length;i++){
              System.out.print(arr[i]+" ");
          }
          int newarr[] = Arrays.copyOfRange(arr,1,10);
          System.out.println("\n 将数组下标0~3复制到新数组中：");
          for(int i=0;i<newarr.length;i++){
              System.out.print(newarr[i]+" ");
          }
    }
}

class OneArrayMemory{
    public static void main(String[] args) {
        int num1 = 1024 * 1024 * 2;
        int[] arr1 = new int[num1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 1;
        }
        //获得占用内存总数，并将单位转换为MB
        long memory1 = Runtime.getRuntime().totalMemory() / 1024 / 1024;
        System.out.println("用一维数组存储占用内存总量为：" + memory1);
        int num2 = 1024 * 1024;
        int[][] arr2 = new int[num2][2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i][0] = i;
            arr2[i][1] = i;
        }
        long memory2 = Runtime.getRuntime().totalMemory() / 1024 / 1024;
        System.out.println("用二维数组存储占用内存总量为：" + memory2);
    }
}


class BubbleSort{
    public static void main(String[] args){
        int[] array=new int[]{63,4,24,1,3,13};
        System.out.println("冒泡排序法的过程是：");
        for(int i=1;i<array.length;i++){
            for(int j=0;j<array.length-i;j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1]=temp;
                }
                System.out.print(array[j]+" ");
            }
            System.out.print("【");
            for(int j=array.length-i;j<array.length;j++){
                System.out.print(array[j]+" ");
            }
            System.out.println("】");

            }
        }
    }

//    {63,4,24,1,3,13}

class Maopao{
    public static void main(String[] args){
        int[] array= new int[]{63,4,24,1,3,13};
        for(int i=1;i<array.length;i++){
            for(int j=0;j<array.length-i;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
                System.out.print(array[j]+" ");

            }
            System.out.println();
            System.out.print("[");
            for(int j=array.length-i;j<array.length;j++){
                System.out.print(array[j]+" ");
            }
            System.out.print("]");
        }


    }

}












