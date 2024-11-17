package Chuong3.B10_QLHocVien;

import java.util.Scanner;

public class HocVienDH extends HocVien {
    int soBuoi;
    int donGia;
    ;

    public HocVienDH() {
    }

    public HocVienDH(String hoTen, String diaChi, String loaiChuongTrinh, int loaiUuTien, int soBuoi, int donGia) {
        super(hoTen, diaChi, loaiChuongTrinh, loaiUuTien);
        this.soBuoi = soBuoi;
        this.donGia = donGia;
    }

    public int getSoBuoi() {
        return soBuoi;
    }

    public void setSoBuoi(int soBuoi) {
        this.soBuoi = soBuoi;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }


    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap so buoi : ");
        this.soBuoi=sc.nextInt();
        System.out.println("nhap don gia : ");
        this.donGia=sc.nextInt();
    }

    @Override
    public String toString() {
        return "HocVienDH{" +
                "hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", loaiChuongTrinh='" + loaiChuongTrinh + '\'' +
                ", loaiUuTien='" + loaiUuTien + '\'' +
                '}';
    }


    @Override
    public float hocPhi() {
        if (this.loaiUuTien == 1)
            return soBuoi * donGia - 1000000;
        if (this.loaiUuTien == 2)
            return soBuoi * donGia - 500000;
        return 0;
    }
}

