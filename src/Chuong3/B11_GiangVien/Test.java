package Chuong3.B11_GiangVien;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        GVThinhGiang GVTG1= new GVThinhGiang();
        GVTG1.nhapThongTin();
        GVTG1.inThongTin();
        GVCoHuu GVCH1=new GVCoHuu();
        GVCH1.nhapThongTin();
        GVCH1.inThongTin();
    }
}
