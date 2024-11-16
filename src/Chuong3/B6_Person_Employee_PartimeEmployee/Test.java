package Chuong3.B6_Person_Employee_PartimeEmployee;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PartTimeEmployee PT1=new PartTimeEmployee("Duy",19,'M',"hzuy","10/2/2015",8);
        System.out.println(PT1.toString());
        System.out.println(PT1.getName());
        System.out.println(PT1.getAge());
        System.out.println(PT1.getGender());
        System.out.println(PT1.getEmployerName());
        System.out.println(PT1.getDateHired());
        System.out.println(PT1.getHoursPerWeek());
    }
}
