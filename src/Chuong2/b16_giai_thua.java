package Chuong2;

import java.util.Scanner;

public class b16_giai_thua {
    public int giaithua(int n){
        if(n==1 || n==0)
            return 1;
        else return n*giaithua(n-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao so n : ");
        int n=sc.nextInt();
        b16_giai_thua giaithua=new b16_giai_thua();
        int giaithuatren=giaithua.giaithua(n);
        System.out.println("giai thua tren "+n+" la : "+giaithuatren);
    }
}
