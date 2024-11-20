package Chuong3.B12_SinhVien;

import java.util.Scanner;

public class SVCDN extends Nguoi{
    float TDKT;
    float SMKT;
    float DTB;

    public SVCDN() {
    }

    public SVCDN(String hoTen, int ngaySinh, String diaChi, String loaiSinhVien, float TDKT, float SMKT,  float DTB) {
        super(hoTen, ngaySinh, diaChi, loaiSinhVien);
        this.TDKT = TDKT;
        this.SMKT = SMKT;

        this.DTB = DTB;
    }

    public float getTDKT() {
        return TDKT;
    }

    public void setTDKT(float TDKT) {
        this.TDKT = TDKT;
    }

    public float getSMKT() {
        return SMKT;
    }

    public void setSMKT(float SMKT) {
        this.SMKT = SMKT;
    }



    public float getDTB() {
        return DTB;
    }

    public void setDTB(float DTB) {
        this.DTB = DTB;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap tong diem kiem tra : ");
        this.TDKT=sc.nextFloat();
        System.out.println("Nhap so mon kiem tra : ");
        this.SMKT=sc.nextFloat();

    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        this.DTB=tinhDiem();
        System.out.println("Diem Trung Binh SVCDN : "+getDTB());
    }

    @Override
    public float tinhDiem() {
        DTB=TDKT/SMKT;
        return DTB;
    }
}
