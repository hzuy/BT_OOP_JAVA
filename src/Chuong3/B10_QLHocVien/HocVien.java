package Chuong3.B10_QLHocVien;

import java.util.Scanner;

public abstract class HocVien {
    String hoTen;
    String diaChi;
    String loaiChuongTrinh;
    int loaiUuTien;
    public void nhapThongTin(){
        Scanner sc=new Scanner(System.in);

        System.out.println("nhap ho ten : ");
        this.hoTen=sc.nextLine();
        System.out.println("nhap dia chi : ");
        this.diaChi=sc.nextLine();
        System.out.println("nhap loai uu tien : ");
        this.loaiUuTien= sc.nextInt();
        System.out.println();
        System.out.println("nhap loai chuong trinh : ");
        this.loaiChuongTrinh= sc.nextLine();

    };
    public void inThongTin(){
        System.out.println("thong tin sinh vien vua nhap : ");
        System.out.println("ho va ten : "+this.hoTen);
        System.out.println("dia chi : "+this.diaChi);
        System.out.println("loai uu tien : "+this.loaiUuTien);
        System.out.println("loai chuong trinh : "+this.loaiChuongTrinh);
        System.out.println("hoc phi : "+this.hocPhi());

    };
    public abstract float hocPhi();

    public HocVien() {
    }

    public HocVien(String hoTen, String diaChi, String loaiChuongTrinh, int loaiUuTien) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loaiChuongTrinh = loaiChuongTrinh;
        this.loaiUuTien = loaiUuTien;
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

    public String getLoaiChuongTrinh() {
        return loaiChuongTrinh;
    }

    public void setLoaiChuongTrinh(String loaiChuongTrinh) {
        this.loaiChuongTrinh = loaiChuongTrinh;
    }

    public int getLoaiUuTien() {
        return loaiUuTien;
    }

    public void setLoaiUuTien(int loaiUuTien) {
        this.loaiUuTien = loaiUuTien;
    }

    @Override
    public String toString() {
        return "HocVien{" +
                "hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", loaiChuongTrinh='" + loaiChuongTrinh + '\'' +
                ", loaiUuTien='" + loaiUuTien + '\'' +
                '}';
    }
}
