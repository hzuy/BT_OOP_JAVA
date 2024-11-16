package Chuong3.B5_DiaChi;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DiaChi DC1=new DiaChi("Dong Say","Thi tran Phung","Dan Phuong","Ha Noi");
        System.out.println(DC1.getThon());
        System.out.println(DC1.getHuyen());
        System.out.println(DC1.getTinh());
        System.out.println(DC1.getXa());
        System.out.println(DC1.toString());
    }
}
