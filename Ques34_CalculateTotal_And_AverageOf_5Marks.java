package Numericals_100_Question;

import java.util.Scanner;

public class Ques34_CalculateTotal_And_AverageOf_5Marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first Num : ");
        int m1= sc.nextInt();
        System.out.print("Enter sec Num : ");
        int m2= sc.nextInt();
        System.out.print("Enter third Num : ");
        int m3= sc.nextInt();
        System.out.print("Enter fourth Num : ");
        int m4= sc.nextInt();
        System.out.print("Enter fiveth Num : ");
        int m5= sc.nextInt();
        int total=m1+m2+m3+m4+m5;
        System.out.println("Total : " +total+ ", Average : "+(total/5));
    }
}
