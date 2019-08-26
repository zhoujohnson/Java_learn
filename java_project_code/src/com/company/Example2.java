package com.company;

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
            for (int j = 0; i < arr[i].length; j++) {
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