package com.juaracoding.method;

public class CallMethod {

//    private Integer intX;

    public static void main(String[] args) {
//        methodX();
        try {
            System.out.println("Sambungan:"+methodX(1,"OK",3.0));
        } catch (InterruptedException e) {
            //mau kirim email
        }
    }

    protected void methodX(){
        methodY();
    }//methodX-

    public static void methodY(){
        System.out.println("Method Two Got Called");
    }
    public static void methodX(String strInput){
        System.out.println("Ini inputan nya : "+strInput);
    }//methodX-str

    public static void methodX(Integer intX){
        System.out.println("Ini inputan nya : "+intX);
        System.out.println(1);
        System.out.println(2L);
        System.out.println(2.0f);
        System.out.println(3.0);
        System.out.println("Ini String");
        System.out.println('X');
    }//methodX-int

    public static void methodX(String strY , Integer intX){
        System.out.println("Ini inputan nya : "+intX);
    }//methodX-Str-Int

    public void methodX(Integer intX,String strY){
        try {
            methodX(1,"OK",3.0);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }//methodX-Int-Str

    public static String methodX(Integer intX,String strY,Double d) throws InterruptedException {
        //statement
        String strZ= intX+strY+d;

        Thread.sleep(1000);
        return strZ;
    }//methodX-Int-Str
}
