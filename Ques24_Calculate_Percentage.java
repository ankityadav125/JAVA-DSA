package Numericals_100_Question;

import java.util.Scanner;

public class Ques24_Calculate_Percentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks :");
        int marks= sc.nextInt();
        System.out.println("Enter total marks :");
        int totalMarks=sc.nextInt();
        double per=(marks*100)/totalMarks;
        System.out.println("Percentage is : "+per);
    }
}
