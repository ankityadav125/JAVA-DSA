package Numericals_100_Question;

import java.util.Scanner;

public class Ques31_AreaOf_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter base : ");
        double base= sc.nextDouble();
        System.out.print("Enter height : ");
        double height=sc.nextDouble();
        System.out.println("Area : "+(0.5*base*height));
    }
}
