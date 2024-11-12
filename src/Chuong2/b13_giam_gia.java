package Chuong2;

import java.util.Scanner;

public class b13_giam_gia {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao gia san pham : ");
        float gia= sc.nextFloat();
        System.out.println("nhap vao phan tram giam gia(%)");
        int phantram=sc.nextInt();
        float giamoi=gia-gia*phantram/100;
        System.out.println("gia sau khi giam "+phantram+"% la : "+giamoi);
    }
}
