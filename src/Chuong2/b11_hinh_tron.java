package Chuong2;

import java.util.Scanner;

public class b11_hinh_tron {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap ban kinh : ");
        float bankinh=sc.nextFloat();
        float dientich= (float) ((Math.PI)*(Math.pow(bankinh,2)));
        float chuvi= (float) (2*bankinh*Math.PI);
    }
}
