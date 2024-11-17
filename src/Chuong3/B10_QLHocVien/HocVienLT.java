package Chuong3.B10_QLHocVien;

public class HocVienLT extends HocVien{
    int soBuoi;
    int donGia;
    int tenLoai;

    public HocVienLT() {
    }

    public HocVienLT(String hoTen, String diaChi, String loaiChuongTrinh, int loaiUuTien, int soBuoi, int donGia, int tenLoai) {
        super(hoTen, diaChi, loaiChuongTrinh, loaiUuTien);
        this.soBuoi = soBuoi;
        this.donGia = donGia;
        this.tenLoai = tenLoai;
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

    public int getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(int tenLoai) {
        this.tenLoai = tenLoai;
    }

    @Override
    public String toString() {
        return "HocVienLT{" +
                "hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", loaiChuongTrinh='" + loaiChuongTrinh + '\'' +
                ", loaiUuTien=" + loaiUuTien +
                '}';
    }

    @Override
    public float hocPhi() {
        if (loaiUuTien == 1)
            return soBuoi * donGia - 1000000;
        if (loaiUuTien == 2)
            return soBuoi * donGia - 800000;
        return 0;
    }
}
