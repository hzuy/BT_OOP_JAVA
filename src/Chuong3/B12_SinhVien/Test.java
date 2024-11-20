package Chuong3.B12_SinhVien;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so sinh vien cao dang nghe  : ");
        int n= sc.nextInt();
        SVCDN [] DSCDN= new SVCDN[n];

       //nhap danh sach sinh vien cao dang nghe
        for(int i=0;i<n;i++){
           DSCDN[i]= new SVCDN();
           DSCDN[i].nhapThongTin();
        }
        //in danh sach sinh vien cao dang nghe
        for(int i=0;i<n;i++){
            System.out.println("thong tin sinh vien cao dang nghe thu "+i);
            DSCDN[i].inThongTin();
        }

        System.out.println("nhap so sinh vien cao dang chinh quy : ");
        int m= sc.nextInt();
        SVCDCQ [] DSCDCQ= new SVCDCQ[m];

        //nhap danh sach sinh vien cao dang chinh quy
        for(int i=0;i<m;i++){
            DSCDCQ[i]= new SVCDCQ();
            DSCDCQ[i].nhapThongTin();
        }
        //in danh sach sinh vien cao dang chinh quy
        for(int i=0;i<m;i++){
            System.out.println("thong tin sinh vien cao dang chinh quy thu "+i);
            DSCDCQ[i].inThongTin();
        }











    }
}
