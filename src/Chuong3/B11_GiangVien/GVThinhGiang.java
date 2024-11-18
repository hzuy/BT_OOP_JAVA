package Chuong3.B11_GiangVien;

import java.util.Scanner;

public class GVThinhGiang extends GiangVien{
     private int soTietDay;
     private float donGia;
     private float thuNhap;

    public GVThinhGiang() {
    }

    public GVThinhGiang(String hoTen, String diaChi, String loaiGV, int soTietDay, float donGia, float thuNhap) {
        super(hoTen, diaChi, loaiGV);
        this.soTietDay = soTietDay;
        this.donGia = donGia;
        this.thuNhap = thuNhap;
    }

    public int getSoTietDay() {
        return soTietDay;
    }

    public void setSoTietDay(int soTietDay) {
        this.soTietDay = soTietDay;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public float getThuNhap() {
        return thuNhap;
    }

    public void setThuNhap(float thuNhap) {
        this.thuNhap = thuNhap;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so tiet day (tiet) : ");
        this.soTietDay=sc.nextInt();
        System.out.println("Nhap don gia(VND) : ");
        this.donGia=sc.nextFloat();
    }

    @Override
    public float tinhLuong() {
        this.thuNhap= (float) (0.15*(this.soTietDay*this.donGia));
        return (this.soTietDay*this.donGia)-this.thuNhap;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Luong thang : "+this.tinhLuong());
    }
}
