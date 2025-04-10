package com.juaracoding.exchandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Hirarki {

    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(System.in);
            System.out.print("Masukkan Nilai IntX ");
            int intX = in.nextInt();
        }catch (NumberFormatException e){
            //kirim email
            System.out.println("Ke Handle Disini NumberFormatException "+e.getMessage());
        }catch (NullPointerException e){
            //kirim email
            System.out.println("Ke Handle Disini NullPointerException "+e.getMessage());
        }catch (IllegalArgumentException e){
            //kirim email
            System.out.println("Ke Handle Disini IllegalArgumentException "+e.getMessage());
        }


    }
}
