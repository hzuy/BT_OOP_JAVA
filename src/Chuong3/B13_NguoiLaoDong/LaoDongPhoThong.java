package Chuong3.B13_NguoiLaoDong;

import java.util.Scanner;

public class LaoDongPhoThong extends NguoiLaoDong{
    float soNgayCong;
    float donGiaNgayCong;
    float thuong;
    float luong;

    public LaoDongPhoThong(String hoTen, String diaChi, String loaiLaoDong, float soNgayCong, float donGiaNgayCong, float thuong, float luong) {
        super(hoTen, diaChi, loaiLaoDong);
        this.soNgayCong = soNgayCong;
        this.donGiaNgayCong = donGiaNgayCong;
        this.thuong = thuong;
        this.luong = luong;
    }

    public LaoDongPhoThong() {
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    public float getSoNgayCong() {
        return soNgayCong;
    }

    public void setSoNgayCong(float soNgayCong) {
        this.soNgayCong = soNgayCong;
    }

    public float getDonGiaNgayCong() {
        return donGiaNgayCong;
    }

    public void setDonGiaNgayCong(float donGiaNgayCong) {
        this.donGiaNgayCong = donGiaNgayCong;
    }

    public float getThuong() {
        return thuong;
    }

    public void setThuong(float thuong) {
        this.thuong = thuong;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so ngay cong (ngay) : ");
        this.soNgayCong=sc.nextFloat();
        sc.nextLine();
        System.out.println("Nhap don gia ngay cong (VND) : ");
        this.donGiaNgayCong=sc.nextFloat();
        sc.nextLine();

    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        luong=tinhLuong();
        System.out.println("Luong cua lao dong pho thong : "+luong);
    }

    @Override
    public float tinhLuong() {
        if(0<this.soNgayCong || this.soNgayCong<=15)
            this.thuong=0;
        else if(15<this.soNgayCong || this.soNgayCong<25)
            this.thuong=700000;
        else if(this.soNgayCong>25)
            this.thuong=1000000;
       this.luong=soNgayCong*donGiaNgayCong+thuong;
       return luong;
    }
}
