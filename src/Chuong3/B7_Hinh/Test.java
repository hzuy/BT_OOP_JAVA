package Chuong3.B7_Hinh;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("nhap vao ban kinh Radius : ");
        double r=sc.nextFloat();
        ResizeableCircle RC=new ResizeableCircle(r);
        double chuvi= RC.getPerimeter();
        double dientich= RC.getArea();
        System.out.println("chu vi cua hinh tron do la : "+chuvi);
        System.out.println("dien tich cua hinh tron do la : "+dientich);

        System.out.println("nhap vao Radius khac (Radius) : ");
        int rs= sc.nextInt();
        RC.resize(rs);

        System.out.println("chu vi sau khi thay doi la : "+RC.getPerimeter());
        System.out.println("chu vi sau khi thay doi la : "+RC.getArea());



    }
}
