package Chuong2;

import java.util.Scanner;

public class b15_nha_nghi {
    public double giamgia(double n,double dongia){
        if(n==1)
            return n*dongia;
        else if(n>1 && n<=4) {
            dongia = dongia - 20 * dongia / 100;
            return n * dongia;
        }
        else if (n > 4 && n <= 10) {
            dongia=dongia-40*dongia/100;
            return n*dongia;
        }
        else {
            dongia=dongia-60*dongia/100;
            return n*dongia;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao so ngay : ");
        double songay= sc.nextDouble();
        System.out.println("Nhap vao so tien : ");
        double sotien= sc.nextDouble();
        b15_nha_nghi obj=new b15_nha_nghi();
        double kq=obj.giamgia(songay,sotien);
        System.out.println("so tien phai tra la : "+kq);


    }
}
