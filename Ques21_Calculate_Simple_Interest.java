package Numericals_100_Question;

import java.util.Scanner;

public class Ques21_Calculate_Simple_Interest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principle amount: ");
        double p=sc.nextDouble();
        System.out.println("Enter rate : ");
        double r=sc.nextDouble();
        System.out.println("Enter time :");
        double t= sc.nextDouble();
        double si=(p*r*t)/100;
        System.out.println("Compound Interest: "+si);
    }
}
