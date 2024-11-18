package Chuong3.B11_GiangVien;

import java.util.Scanner;

public abstract class GiangVien {
    private String hoTen;
    private String diaChi;
    private String loaiGV;

    public GiangVien() {
    }

    public GiangVien(String hoTen, String diaChi, String loaiGV) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loaiGV = loaiGV;
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

    public String getLoaiGV() {
        return loaiGV;
    }

    public void setLoaiGV(String loaiGV) {
        this.loaiGV = loaiGV;
    }


    public abstract float tinhLuong();
    public void nhapThongTin(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ho ten : ");
        this.hoTen= sc.nextLine();
        System.out.println("Nhap dia chi : ");
        this.diaChi=sc.nextLine();
        System.out.println("Nhap loai giang vien (Co Huu/Thinh Giang) : ");
        this.loaiGV=sc.nextLine();
    }
    public void inThongTin(){
        System.out.println("Ho ten : "+this.getHoTen());
        System.out.println("Dia chi  : "+this.getDiaChi());
        System.out.println("Loai Giang Vien  : "+this.getLoaiGV());
    }
}
