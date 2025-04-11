package com.juaracoding.arraypadajava;

import java.util.ArrayList;
import java.util.List;

public class ContohAddDataToArray {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);

        int lSize = l.size();
        int intArr [] = new int[lSize];
        /** mengisi Array nya */
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = l.get(i);
        }

        /** Mengekstrak Nilai yang ada padaa Array nya */
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
    }
}
