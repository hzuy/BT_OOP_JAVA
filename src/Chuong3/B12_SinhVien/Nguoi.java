package Chuong3.B12_SinhVien;

import java.util.Scanner;

public abstract class Nguoi {
    String hoTen;
    int ngaySinh;
    String diaChi;
    String loaiSinhVien;

    public Nguoi() {
    }

    public Nguoi(String hoTen, int ngaySinh, String diaChi, String loaiSinhVien) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.loaiSinhVien = loaiSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(int ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getLoaiSinhVien() {
        return loaiSinhVien;
    }

    public void setLoaiSinhVien(String loaiSinhVien) {
        this.loaiSinhVien = loaiSinhVien;
    }




    public void nhapThongTin(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap ho ten : ");
        this.hoTen= sc.nextLine();
        System.out.println("nhap ngay sinh : ");
        this.ngaySinh=sc.nextInt();
        sc.nextLine();
        System.out.println("nhap dia chi : ");
        this.diaChi=sc.nextLine();

        System.out.println("nhap loai sinh vien : ");
        this.loaiSinhVien=sc.nextLine();
    };

    public void inThongTin(){
        System.out.println("Ho ten : "+getHoTen());
        System.out.println("Dia chi : "+getDiaChi());
        System.out.println("Ngay sinh : "+getNgaySinh());
        System.out.println("Loai sinh vien  : "+getLoaiSinhVien());
    }

    public abstract float tinhDiem();

}
