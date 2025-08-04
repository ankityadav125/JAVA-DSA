package Numericals_100_Question;

import java.util.Scanner;

public class Ques15_AreaOf_Reactangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a length:");
        int l= sc.nextInt();
        System.out.print("Enter a breadth:");
        int b=sc.nextInt();
        System.out.println("Area of reactangle is : "+(l*b));
    }
}
