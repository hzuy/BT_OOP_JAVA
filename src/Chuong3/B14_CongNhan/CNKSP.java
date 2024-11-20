package Chuong3.B14_CongNhan;

import java.util.Scanner;

public class CNKSP extends CongNhan{
    private int soSanPham;
    private float donGiaSanPham;
    private float thuong;
    private float luongThang;

    public CNKSP() {
    }

    public int getSoSanPham() {
        return soSanPham;
    }

    public void setSoSanPham(int soSanPham) {
        this.soSanPham = soSanPham;
    }

    public float getDonGiaSanPham() {
        return donGiaSanPham;
    }

    public void setDonGiaSanPham(float donGiaSanPham) {
        this.donGiaSanPham = donGiaSanPham;
    }

    public float getThuong() {
        return thuong;
    }

    public void setThuong(float thuong) {
        this.thuong = thuong;
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
        System.out.println("Nhap so san pham : ");
        this.soSanPham= sc.nextInt();
        System.out.println("Nhap don gia san pham : ");
        this.donGiaSanPham= sc.nextInt();

    }

    @Override
    public void inThongTin() {
        luongThang=tinhLuong();
        super.inThongTin();
        System.out.println("Luong thang cua cong nhan khoan san pham : "+tinhLuong());
    }

    @Override
    public float tinhLuong() {
        if(this.soSanPham<1000 && this.soSanPham>0)
            this.thuong=0;
        else if(this.soSanPham>=1000 && this.soSanPham<1150)
            this.thuong=1000000;
        else if(this.soSanPham>=1150)
            this.thuong=1500000;
        this.luongThang=this.donGiaSanPham*this.soSanPham+this.thuong;
        return luongThang;
    }
}
