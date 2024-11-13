package Chuong3.B3_NhanVien;

public class Test {
    public static void main(String[] args) {
        DiaChi DC1= new DiaChi("Pho Phan Dinh Phung","Thi tran Phung","huyen Dan Phuong","TP Ha Noi");
        NhanVien NV1=new NhanVien("Duy",DC1,"17/5/2005",'M');
        System.out.println(NV1.toString());
    }
}
