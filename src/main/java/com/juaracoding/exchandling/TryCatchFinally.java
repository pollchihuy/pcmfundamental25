package com.juaracoding.exchandling;

public class TryCatchFinally {

    public static void main(String[] args) {
        try{
            // tempat script yg kita tulis
            // {disini seluruh script sudah diawasi}
            int intX = 1/0;
            System.out.println("Cuma Text Doank !!");
        }catch(Exception e){
            // tulis ke log file
            // tulis ke log table
            // kirim ke email
            // kirim ke whatsapp
            System.out.println("Disini tempat handling nya !!"+e.getMessage());
        }finally {
            //tutup koneksi
            System.out.println("INI AKAN SELALU DI EKSEKUSI !!");
        }
    }
}
