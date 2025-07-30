package Numericals_100_Question;

import java.util.Scanner;

public class Ques06_Calculate_Electricity_Bills {
    public static void main(String[] args) {
//        int units=123;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter units : ");
        int units=sc.nextInt();
        int bill=0;
        if(units>100){
            bill=units*8;
        }
        if(units>200){
            bill=units*6;
        }
        if(units>300){
            bill=units*5;
        }
        System.out.println("Unit consumed : "+units);
        System.out.println("Total bill : "+bill);
    }
}
