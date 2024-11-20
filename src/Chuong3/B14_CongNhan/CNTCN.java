package Chuong3.B14_CongNhan;

import java.util.Scanner;

public class CNTCN extends CongNhan{
    private float luongCoBan;
    private float heSoLuong;
    private float thuong;
    private int soNgayCong;
    private float luongThang;

    public CNTCN() {
    }

    public CNTCN(String hoTen, String diaChi, String loaiCongNhan, int ngaySinh, float luongCoBan, float heSoLuong, float thuong,int soNgayCong,float luongThang) {
        super(hoTen, diaChi, loaiCongNhan, ngaySinh);
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        this.thuong = thuong;
        this.soNgayCong = soNgayCong;
        this.luongThang=tinhLuong();
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

    public float getThuong() {
        return thuong;
    }

    public void setThuong(float thuong) {
        this.thuong = thuong;
    }

    public int getSoNgayCong() {
        return soNgayCong;
    }

    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }
    public float getLuongThang() {
        return luongThang;
    }
    public void setLuongThang(float luongThang) {
        this.luongThang = luongThang;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap luong co ban (VND) : ");
        this.luongCoBan=sc.nextFloat();
        System.out.println("Nhap he so luong : ");
        this.heSoLuong=sc.nextFloat();
        System.out.println("Nhap so ngay cong : ");
        this.soNgayCong=sc.nextInt();
    }

    @Override
    public void inThongTin() {

        super.inThongTin();
        System.out.println("Luong cua cong nhan khoan thuong : "+tinhLuong());
    }

    @Override
    public float tinhLuong() {
        if(this.soNgayCong<20)
            this.thuong=0;
        else if(this.soNgayCong>=20 )
            this.thuong= (float) (1.2*this.luongCoBan);
        return this.luongCoBan*this.heSoLuong+this.thuong;
    }
}
