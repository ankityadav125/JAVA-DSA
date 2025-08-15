package Numericals_100_Question;

import java.util.Scanner;

public class Ques33_Calculate_BMI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter weight :");
        double weight= sc.nextDouble();
        System.out.println("Enter height :");
        double height= sc.nextDouble();
        double bmi=weight/(height*height);
        System.out.println("BMI : " +bmi);
    }
}
