package Numericals_100_Question;

import java.util.Scanner;

public class Ques23_Power_Of_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first Num :");
        int a=sc.nextInt();
        System.out.print("Enter second Num : ");
        int b=sc.nextInt();
        System.out.println("Result : "+Math.pow(a,b));
    }
}
