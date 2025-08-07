package Numericals_100_Question;

import java.util.Scanner;

public class Ques22_Calculate_Compound_Interest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principle amount: ");
        double p=sc.nextDouble();
        System.out.println("Enter rate : ");
        double r=sc.nextDouble();
        System.out.println("Enter time :");
        double t= sc.nextDouble();
        double ci=p * Math.pow((1+r/100),t)-p;
        System.out.println(ci);
    }
}
