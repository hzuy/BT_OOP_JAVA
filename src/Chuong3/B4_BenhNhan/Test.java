package Chuong3.B4_BenhNhan;

public class Test {
    public static void main(String[] args) {
        BenhVien BV= new BenhVien("BV Bach Mai","Q.Hai Ba Trung","Duy");
        BenhNhan BN= new BenhNhan("BN1",19,'M',"Dep Trai","Ung Thu",BV);
        System.out.println(BN.toString());
    }
}
