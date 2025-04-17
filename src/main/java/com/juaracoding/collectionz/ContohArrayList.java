package com.juaracoding.collectionz;

import com.juaracoding.stringobject.ContohObject;

import java.util.ArrayList;
import java.util.List;

public class ContohArrayList {

    public static void main(String[] args) {

        StringBuilder sBuild = new StringBuilder();
        sBuild.append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a");
        String strAppend = sBuild.append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").append("a").toString();
        sBuild.setLength(0);
        sBuild.append("b").append("b").append("b").append("b").append("b").append("b").append("b").append("b").append("b").append("b").append("b").append("b").append("b").append("b").append("b").append("b").append("b").append("b").append("b").append("b").append("b").append("b").append("b").append("b").append("b").append("b").append("b").append("b").append("b").append("b").append("b").append("b").append("b").append("b").append("b").append("b").append("b").append("b").append("b").append("b").append("b").append("b").append("b").append("b").append("b").append("b").append("b").append("b");

        String strX = "Paul Paul Paul";
        int intLength = strX.length();
        System.out.println(intLength);

        String strY = "Paul Paul Paul Paul";
        System.out.println(intLength);

        ArrayList<String> list = new ArrayList<String>();
        /** cara memasukkan data */
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println("Object list : "+list);
        ArrayList<Integer> listInteger = new ArrayList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        System.out.println("Object listInteger : "+listInteger);
        System.out.println("listInteger index 0 : "+listInteger.get(0));
        System.out.println("listInteger index 1 : "+listInteger.get(1));
        System.out.println("listInteger index 2 : "+listInteger.get(2));
        System.out.println("listInteger index 3 : "+listInteger.get(3));
        System.out.println("===========================");
        System.out.println("===========================");

        for (int i = 0; i < listInteger.size(); i++) {
            System.out.println("listInteger index "+i+" : "+listInteger.get(i));
        }

        /** Dynamic Binding */
        List<Integer> listInteger2 = new ArrayList<Integer>();
        List<String> listStr = new ArrayList<String>();
        //K V
//nama jumlah harga // linked
// paul bogor paul@gmail.com // linked

// harga nama jumlah // hasmap
// bogor paul@gmail.com paul // hashmap


        //nama
        //alamat
        //email
        /**
         * {
         * email:
         * alamat:
         * nama:
         * }
         */

        /** ArrayList Object */
        ArrayList<ContohObject> l1 = new ArrayList<>();
        l1.add(new ContohObject(1L,"1L",1.0));//0
        l1.add(new ContohObject(2L,"2L",2.0));//1
        l1.add(new ContohObject(3L,"3L",3.0));//2
        l1.add(new ContohObject(4L,"4L",4.0));//3
        System.out.println("Object l1 : "+l1);
        int intSize = l1.size();//4
        //Object l1 :
        // [
        // com.juaracoding.stringobject.ContohObject@7530d0a
        // com.juaracoding.stringobject.ContohObject@27bc2616
        // com.juaracoding.stringobject.ContohObject@3941a79c
        // com.juaracoding.stringobject.ContohObject@506e1b77
        // ]
        for (int i = 0; i < l1.size(); i++) {
            System.out.println("Index - "+i+" -- Data 1 : "+l1.get(i).getData1());
            System.out.println("Index - "+i+" -- Data 2 : "+l1.get(i).getData2());
            System.out.println("Index - "+i+" -- Data 3 : "+l1.get(i).getData3());
            System.out.println("=====================");
            System.out.println("=====================");
        }
        l1.remove(0);
        l1.add(new ContohObject(5L,"5L",5.0));//3
        l1.set(2,new ContohObject(6L,"6L",6.0));
        System.out.println("Object l1 : "+l1);//Object l1 : [
        // com.juaracoding.stringobject.ContohObject@7530d0a
        // com.juaracoding.stringobject.ContohObject@27bc2616
        // com.juaracoding.stringobject.ContohObject@3d494fbf
        // com.juaracoding.stringobject.ContohObject@506e1b77
        // com.juaracoding.stringobject.ContohObject@1ddc4ec2]
        for (int i = 0; i < l1.size(); i++) {
            System.out.println("Index - "+i+" -- Data 1 : "+l1.get(i).getData1());
            System.out.println("Index - "+i+" -- Data 2 : "+l1.get(i).getData2());
            System.out.println("Index - "+i+" -- Data 3 : "+l1.get(i).getData3());
            System.out.println("=====================");
        }
        System.out.println("=====================");
        System.out.println("=====================");
        for (ContohObject c1 : l1) {
            System.out.println("Data 1 : "+c1.getData1());
            System.out.println("Data 2 : "+c1.getData2());
            System.out.println("Data 3 : "+c1.getData3());
            System.out.println("=====================");
        }

        l1.clear();
        ContohObject c = new ContohObject(7L,"7L",7.0);
        l1.add(c);
        c = new ContohObject(7L,"7L",7.0);
        l1.add(c);
        c = new ContohObject(7L,"7L",7.0);
        l1.add(c);
        c = new ContohObject(7L,"7L",7.0);
        l1.add(c);
        c = new ContohObject(7L,"7L",7.0);
        l1.add(c);
        c = new ContohObject(7L,"7L",7.0);
        l1.add(c);
        System.out.println("Object l1 : "+l1);//Object l1 : [
        // com.juaracoding.stringobject.ContohObject@133314b
        // com.juaracoding.stringobject.ContohObject@133314b
        // com.juaracoding.stringobject.ContohObject@133314b
        // com.juaracoding.stringobject.ContohObject@133314b
        // com.juaracoding.stringobject.ContohObject@133314b
        // com.juaracoding.stringobject.ContohObject@133314b]

        //[
        // com.juaracoding.stringobject.ContohObject@133314b
        // com.juaracoding.stringobject.ContohObject@b1bc7ed
        // com.juaracoding.stringobject.ContohObject@7cd84586
        // com.juaracoding.stringobject.ContohObject@30dae81
        // com.juaracoding.stringobject.ContohObject@1b2c6ec2
        // com.juaracoding.stringobject.ContohObject@4edde6e5]
        for (int i = 0; i < l1.size(); i++) {
            System.out.println("Index - "+i+" -- Data 1 : "+l1.get(i).getData1());
            System.out.println("Index - "+i+" -- Data 2 : "+l1.get(i).getData2());
            System.out.println("Index - "+i+" -- Data 3 : "+l1.get(i).getData3());
            System.out.println("=====================");
        }
        for (ContohObject c1 : l1) {
            System.out.println("Data 1 : "+c1.getData1());
            System.out.println("Data 2 : "+c1.getData2());
            System.out.println("Data 3 : "+c1.getData3());
            System.out.println("=====================");
        }
    }
}
