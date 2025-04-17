package com.juaracoding.collectionz;

import com.juaracoding.stringobject.ContohObject;

public class ArrayObject {

    public static void main(String[] args) {
        int intX = 0;
        ContohObject contoh = new ContohObject();
        System.out.println(intX);
        System.out.println(contoh);
        int [] intArr = new int [2];
        intArr[0] = 0;
        intArr[1] = 1;
        System.out.println("Index ke 0 "+intArr[0]);
        System.out.println("Index ke 1 "+intArr[1]);
        intArr[1] = 7;//di update nilai nya
        System.out.println("Index ke 0 "+intArr[0]);
        System.out.println("Index ke 1 "+intArr[1]);

        /** Cara Penulisan pertama */
        ContohObject [] contohObjectArr = new ContohObject [2];
        ContohObject contohObj = new ContohObject();
        contohObj.setData1(1L);
        contohObj.setData2("1L");
        contohObj.setData3(1.0);
        contohObjectArr[0] = contohObj;
        contohObj = new ContohObject();
        contohObj.setData1(2L);
        contohObj.setData2("2L");
        contohObj.setData3(2.0);
        contohObjectArr[1] = contohObj;
        System.out.println("Index 0 Data 1 : "+contohObjectArr[0].getData1());
        System.out.println("Index 1 Data 3 : "+contohObjectArr[1].getData3());

        System.out.println("==========================================================");
        /** Cara Penulisan pertama */
        contohObjectArr = new ContohObject [2];
        contohObjectArr[0] = new ContohObject(3L,"3L",3.0);
        contohObjectArr[1] = new ContohObject(4L,"4L",4.0);

        System.out.println("Index 0 Data 1 : "+contohObjectArr[0].getData1());
        System.out.println("Index 1 Data 3 : "+contohObjectArr[1].getData3());



        for (int i = 0; i < contohObjectArr.length; i++) {
            System.out.println("Index - "+i+" -- Data 1 : "+contohObjectArr[i].getData1());
            System.out.println("Index - "+i+" -- Data 2 : "+contohObjectArr[i].getData2());
            System.out.println("Index - "+i+" -- Data 3 : "+contohObjectArr[i].getData3());
            System.out.println("=====================");
        }
        System.out.println("=====================");System.out.println("=====================");
        contohObjectArr[1].setData2("4K");
        for (int i = 0; i < contohObjectArr.length; i++) {
            System.out.println("Index - "+i+" -- Data 1 : "+contohObjectArr[i].getData1());
            System.out.println("Index - "+i+" -- Data 2 : "+contohObjectArr[i].getData2());
            System.out.println("Index - "+i+" -- Data 3 : "+contohObjectArr[i].getData3());
            System.out.println("=====================");
        }
    }
}
