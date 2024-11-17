package Chuong3.B8_HCN_HTG;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Rectangular
        System.out.println("nhap vao mau cua HCN : ");
        String mauHCN= sc.next();
        System.out.println("nhap vao chieu dai cua HCN : ");
        int CD= sc.nextInt();
        System.out.println("nhap vao chieu dai cua HCN : ");
        int CR= sc.nextInt();


        Rectangle HCN1= new Rectangle(mauHCN,CD,CR);
        System.out.println("dien tich HCN la : "+HCN1.getArea());
        System.out.println(HCN1.toString());

        //Triangle
        System.out.println("nhap vao mau cua tam giac : ");
        String mauTG= sc.next();
        System.out.println("nhap vao day cua tam giac : ");
        int day= sc.nextInt();
        System.out.println("nhap vao chieu cao cua tam giac : ");
        int chieucao= sc.nextInt();


       Triangle TG1= new Triangle(mauTG,day,chieucao);
        System.out.println("dien tich hinh tam giac la : "+TG1.getArea());
        System.out.println(TG1.toString());

        



    }
}
