package com.juaracoding.collectionz;

import com.juaracoding.stringobject.ContohObject;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ContohHashSet {

    public static void main(String[] args) {
        ContohObject c = new ContohObject(7L,"7L",7.0);
        HashSet<ContohObject> set2 = new HashSet<>();
        set2.add(c);
        set2.add(c);
        set2.add(c);
        set2.add(c);
        set2.add(c);
        set2.add(c);
        set2.add(c);
        System.out.println(set2);
        Set s = new HashSet();
        s.add(1);
        s.add("B");
        s.add(2);
        s.add(c);
        s.add(3.0);
        s.add(3.0);
        Iterator it = s.iterator();
        while (it.hasNext()) {
            Object o = it.next();
            if(o.equals("B")){
                System.out.println("Kena Deh B !!");
            }
            System.out.println(o);
        }
        System.out.println(s);
//        Set<ContohObject> set = new HashSet<>();
    }
}
