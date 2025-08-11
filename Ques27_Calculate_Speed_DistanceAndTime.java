package Numericals_100_Question;

import java.util.Scanner;

public class Ques27_Calculate_Speed_DistanceAndTime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Distance");
        double dist=sc.nextDouble();
        System.out.println("Enter time");
        double t=sc.nextDouble();
        double speed=dist/t;
        System.out.println("Speed : "+speed+ "km/hr");
    }
}
