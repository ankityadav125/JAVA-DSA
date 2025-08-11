package Numericals_100_Question;

import java.util.Scanner;

public class Ques28_CalculatePerimeter_Of_Reactangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length : ");
        int l=sc.nextInt();
        System.out.print("Enter Breadth : ");
        int b= sc.nextInt();
        System.out.println("Perimeter : "+(2*(l+b)));
    }
}
