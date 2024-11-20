package Chuong3.B13_NguoiLaoDong;

import java.util.Scanner;

public abstract class NguoiLaoDong {
    String hoTen;
    String diaChi;
    String loaiLaoDong;

    public NguoiLaoDong(String hoTen, String diaChi, String loaiLaoDong) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loaiLaoDong = loaiLaoDong;
    }

    public NguoiLaoDong() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getLoaiLaoDong() {
        return loaiLaoDong;
    }

    public void setLoaiLaoDong(String loaiLaoDong) {
        this.loaiLaoDong = loaiLaoDong;
    }
    public void nhapThongTin(){
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println("Nhap ho ten : ");
        this.hoTen=sc.nextLine();
        System.out.println("Nhap dia chi : ");
        this.diaChi=sc.nextLine();
        System.out.println("Nhap loai lao dong : ");
        this.loaiLaoDong=sc.nextLine();
    }
    public void inThongTin(){
        System.out.println("Ho ten : "+getHoTen());
        System.out.println("Dia chi : "+getDiaChi());
        System.out.println("Loai lao dong : "+getLoaiLaoDong());
    }
    public abstract float tinhLuong();
}
