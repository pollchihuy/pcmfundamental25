package com.juaracoding.wrapperclass;


public class ObjectWrapper {

    public static void main(String[] args) {
        String strX = "15";
        int intX = Integer.parseInt(strX);
        double doubleX = Double.parseDouble(strX);
        float floatX = Float.parseFloat(strX);
        short shortX = Short.parseShort(strX);
    }

    public static int parseInt(String str) throws NumberFormatException {
        try{
            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if(!(chars[i]>=47 || chars[i]<=57)){
                    throw new NumberFormatException("Bukan Angka");
                }
            }
        }catch (Exception e){

        }
        return 0;
    }
}
