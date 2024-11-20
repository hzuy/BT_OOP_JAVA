package Chuong3.B12_SinhVien;

import java.util.Scanner;

public class SVCDCQ extends Nguoi {
    float TDKT;
    float SMKT;
    float DTKTHP;
    float DTB;

    public SVCDCQ() {

    }

    public SVCDCQ(String hoTen, int ngaySinh, String diaChi, String loaiSinhVien, float TDKT, float SMKT, float DTKTHP, float DTB) {
        super(hoTen, ngaySinh, diaChi, loaiSinhVien);
        this.TDKT = TDKT;
        this.SMKT = SMKT;
        this.DTKTHP = DTKTHP;
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

    public float getDTKTHP() {
        return DTKTHP;
    }

    public void setDTKTHP(float DTKTHP) {
        this.DTKTHP = DTKTHP;
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
        this.DTKTHP=sc.nextFloat();
        System.out.println("Nhap so mon kiem tra : ");
        this.SMKT=sc.nextFloat();
        System.out.println("Nhap diem thi ket thuc hoc phan : ");
        this.DTKTHP=sc.nextFloat();

    }

    @Override
    public void inThongTin() {
       this.DTB=tinhDiem();
        super.inThongTin();
        System.out.println("diem trung binh sinh vien cao dang chinh quy : "+getDTB());
    }

    @Override
    public float tinhDiem() {
        this.DTB=(this.TDKT/this.SMKT+this.DTKTHP)/3;
        return this.DTB;
    }
}
