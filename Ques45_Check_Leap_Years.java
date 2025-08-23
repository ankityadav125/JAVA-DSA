package Numericals_100_Question;

import java.util.Scanner;

public class Ques45_Check_Leap_Years {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Years : ");
        int year=sc.nextInt();
        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println(year +" is leap Year ");
        } else{
            System.out.println(year +" is not leap year");
        }
    }
}
