package Chuong3.B11_GiangVien;

import java.util.Scanner;

public class GVCoHuu extends GiangVien{
    private float luongCoBan;
    private float heSoLuong;
    private float phuCap;
    private int namCongTac;

    public GVCoHuu() {
    }

    public GVCoHuu(String hoTen, String diaChi, String loaiGV, float luongCoBan, float heSoLuong, float phuCap,int namCongTac) {
        super(hoTen, diaChi, loaiGV);
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        this.phuCap = phuCap;
        this.namCongTac=namCongTac;
    }

    public float getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(float luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public float getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(float phuCap) {
        this.phuCap = phuCap;
    }

    public int getNamCongTac() {
        return namCongTac;
    }

    public void setNamCongTac(int namCongTac) {
        this.namCongTac = namCongTac;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap luong co ban (VND) : ");
        this.luongCoBan=sc.nextFloat();
        System.out.println("Nhap he so luong : ");
        this.heSoLuong=sc.nextFloat();
        System.out.println("Nhap nam cong tac (nam) : ");
        this.namCongTac=sc.nextInt();
    }

    @Override
    public float tinhLuong() {
    if(this.namCongTac<5)
        this.phuCap=0*this.luongCoBan;
    else if(this.namCongTac>=5)
        this.phuCap= ((this.namCongTac) / 100) * this.luongCoBan;
    return this.luongCoBan*this.heSoLuong+this.phuCap;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Tien Luong: "+this.tinhLuong());
    }
}
