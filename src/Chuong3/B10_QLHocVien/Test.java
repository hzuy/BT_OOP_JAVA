package Chuong3.B10_QLHocVien;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao so phan tu trong danh sach Hoc Vien Do Hoa : ");
        int n= sc.nextInt();

        //nhap thong tin hoc vien do hoa vao mang
      HocVienDH [] DSDH= new HocVienDH[n];
      for(int i=0;i< DSDH.length;i++){
          System.out.println("thong tin Hoc vien thu "+i);
          DSDH[i]=new HocVienDH();
          DSDH[i].nhapThongTin();
      }
      //in ra thong tin hoc vien do hoa vao mang
      for(int i=0;i< DSDH.length;i++) {
          System.out.println("thong tin Hoc vien thu " + i);
          DSDH[i].inThongTin();
      }

        System.out.println("nhap vao so phan tu trong danh sach Hoc Vien Lap Trinh : ");
        int m= sc.nextInt();

        //nhap thong tin hoc vien lap trinh vao mang
        HocVienLT [] DSLT= new HocVienLT[m];
        for(int i=0;i< DSLT.length;i++){
            System.out.println("thong tin Hoc vien thu "+i);
            DSLT[i]=new HocVienLT();
            DSLT[i].nhapThongTin();
        }
        //in ra thong tin hoc vien lap trinh vao mang
        for(int i=0;i< DSLT.length;i++){
            System.out.println("thong tin Hoc vien thu "+i);
            DSLT[i].inThongTin();
        }




    }
}
