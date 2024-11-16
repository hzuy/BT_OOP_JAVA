package Chuong2;

import java.util.Scanner;

public class b20_doC_doF {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        System.out.println("nhap vao do C : ");
        float doC=sc.nextFloat();
       float doF=doC*1.8f+32;
       System.out.println("do F la : "+doF);
    }
}
