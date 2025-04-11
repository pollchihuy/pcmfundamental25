package com.juaracoding.arraypadajava;

public class ArrayDuaDimensi {

    public static void main(String[] args) {
        int [][] intArr = new int[2][3];
        intArr[0][0] = 1;
        intArr[0][1] = 2;
        intArr[0][2] = 3;
        intArr[1][0] = 4;
        intArr[1][1] = 5;
        intArr[1][2] = 6;

        int [][] intArr1 = {{1,2,3},{4,5,6}};
        System.out.println("Baris intArr "+intArr.length);
        System.out.println("Kolom Pada Baris ke 1 intArr "+intArr[0].length);
        System.out.println("Kolom Pada Baris ke 2 intArr "+intArr[1].length);


        int [][] intArr2 = {{1,2,3},{4,5,6,7}};
        System.out.println("Baris intArr2 "+intArr2.length);
        System.out.println("Kolom Pada Baris ke 1 intArr2 "+intArr2[0].length);
        System.out.println("Kolom Pada Baris ke 2 intArr2 "+intArr2[1].length);
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr[i].length; j++) {
                System.out.print(intArr[i][j]+"||");
            }
            System.out.println();
        }
        System.out.println("=======================");
        for (int i = 0; i < intArr2.length; i++) {
            for (int j = 0; j < intArr2[i].length; j++) {
                System.out.print(intArr2[i][j]+"||");
            }
            System.out.println();
        }
    }
}
