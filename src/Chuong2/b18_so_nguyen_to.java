package Chuong2;

import java.util.Scanner;

public class b18_so_nguyen_to {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao so nguyen to");
        int n=sc.nextInt();
        int demuoc=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
                demuoc++;
            else demuoc+=0;
        }
        if(demuoc==2)
            System.out.println("day la so nguyen to ");
        else if(demuoc>2)
            System.out.println("day khong la so nguyen to");
    }
}
