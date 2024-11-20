package Chuong3.B13_NguoiLaoDong;

import Chuong3.B12_SinhVien.Nguoi;

import java.util.Scanner;

public class KiSu extends NguoiLaoDong {
    float luongCoBan;
    float heSoLuong;
    float thuong;
    float luong;
    float soNgayCong;

    public KiSu() {
    }

    public KiSu(String hoTen, String diaChi, String loaiLaoDong, float luongCoBan, float heSoLuong, float thuong, float luong, float soNgayCong) {
        super(hoTen, diaChi, loaiLaoDong);
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        this.thuong = thuong;
        this.luong = luong;
        this.soNgayCong = soNgayCong;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so luong co ban (VND) : ");
        this.luongCoBan=sc.nextFloat();
        sc.nextLine();
        System.out.println("Nhap he so luong : ");
        this.heSoLuong=sc.nextFloat();
        sc.nextLine();


    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        luong=tinhLuong();
        System.out.println("Luong cua ki su : "+luong);

    }

    @Override
    public float tinhLuong() {
        if(0<this.soNgayCong || this.soNgayCong<=15)
            this.thuong=0;
        else if(15<this.soNgayCong || this.soNgayCong<25)
            this.thuong=700000;
        else if(this.soNgayCong>25)
            this.thuong=1000000;
        this.luong=luongCoBan*heSoLuong+thuong;
        return luong;
    }


}
