package Chuong2;

import java.util.Scanner;

public class b5_nhap_xuat {
    public static void main(String[] args) {

        //nhap vao
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap so nguyen : ");
        int n=sc.nextInt();
        System.out.println("nhap vao so thuc : ");
        double k=sc.nextDouble();
        System.out.println("nhap vao mot ki tu : ");
        char kitu=sc.next().charAt(0);
        System.out.println("nhap vao mot chuoi ki tu : ");
        String chuoi=sc.next();

        //xuat ra
        System.out.println("so nguyen vua nhap la : "+n);
        System.out.println("so thuc vua nhap la : "+k);
        System.out.println("ki tu vua nhap la : "+kitu);
        System.out.println("chuoi vua nhap la : "+chuoi);

    }
}
