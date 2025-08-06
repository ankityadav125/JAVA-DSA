package Numericals_100_Question;

import java.util.Scanner;

public class Ques19_Convert_Celsius_to_Fahrenheit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter celsius :");
        double c=sc.nextDouble();
        double f=(c*9/5)+32;
        System.out.println("Fre : "+f);
    }
}
