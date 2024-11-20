package Chuong3.B14_CongNhan;

import java.util.Scanner;

public abstract class CongNhan {
    private String hoTen;
    private String diaChi;
    private String loaiCongNhan;
    private int ngaySinh;

    public CongNhan() {
    }

    public CongNhan(String hoTen, String diaChi, String loaiCongNhan,int ngaySinh) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loaiCongNhan = loaiCongNhan;
        this.ngaySinh=ngaySinh;
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

    public String getLoaiCongNhan() {
        return loaiCongNhan;
    }

    public void setLoaiCongNhan(String loaiCongNhan) {
        this.loaiCongNhan = loaiCongNhan;
    }

    public int getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(int ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void nhapThongTin(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ho ten : ");
        this.hoTen=sc.nextLine();
        System.out.println("Nhap ngay sinh : ");
        this.ngaySinh=sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap dia chi : ");
        this.diaChi=sc.nextLine();
        System.out.println("Nhap loai cong nhan(CNKSP/CNTCN) :");
        this.loaiCongNhan=sc.nextLine();
    }
    public void inThongTin(){
        System.out.println("Ho ten : "+getHoTen());
        System.out.println("Ngay sinh : "+getNgaySinh());
        System.out.println("Dia chi : "+getDiaChi());
        System.out.println("Loai cong nhan : "+getLoaiCongNhan());
    }
    public abstract float tinhLuong();
}
