package Chuong3.B13_NguoiLaoDong;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap so luong nguoi lao dong pho thong : ");
        int n= sc.nextInt();
        LaoDongPhoThong [] DSLDPT=new LaoDongPhoThong[n];

        //nhap thong tin lao dong pho thong
        for(int i=0;i<DSLDPT.length;i++){
            DSLDPT[i]=new LaoDongPhoThong();
            DSLDPT[i].nhapThongTin();
        }
        //in thong tin lao dong pho thong

        for(int i=0;i<DSLDPT.length;i++) {
            System.out.println("thong tin lao dong pho thong thu "+i+1);
            DSLDPT[i].inThongTin();
        }


        System.out.println("nhap so luong ki su : ");
        int m=sc.nextInt();
        KiSu [] DSKS=new KiSu[m];

        //nhap thong tin ki su
        for(int i=0;i<DSKS.length;i++){
            DSLDPT[i]=new LaoDongPhoThong();
            DSLDPT[i].nhapThongTin();
        }
        //in thong tin ki su

        for(int i=0;i<DSKS.length;i++) {
            System.out.println("thong tin lao dong pho thong thu "+i+1);
            DSLDPT[i].inThongTin();
        }

    }
}
