package Chuong3.B14_CongNhan;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //khai bao cong nhan tinh cong nhat
        System.out.println("nhap so cong nhan tinh cong nhat:");
        int n=sc.nextInt();
        CNTCN [] DSCNTCN=new CNTCN[n];

        //nhap thong tin
        for(int i=0;i<DSCNTCN.length;i++){
            DSCNTCN[i]=new CNTCN();
            DSCNTCN[i].nhapThongTin();
        }

        //in thong tin
        for(int i=0;i<DSCNTCN.length;i++){
            DSCNTCN[i].inThongTin();
        }

        //khai bao cong nhan khoan san pham
        System.out.println("nhap so cong nhan khoan san pham:");
        int m=sc.nextInt();
        CNKSP [] DSCNKSP=new CNKSP[m];

        //nhap thong tin
        for(int i=0;i<DSCNKSP.length;i++){
            DSCNKSP[i]=new CNKSP();
            DSCNKSP[i].nhapThongTin();
        }

        //in thong tin
        for(int i=0;i<DSCNKSP.length;i++){
            DSCNKSP[i].inThongTin();
        }
    }
}
