package Numericals_100_Question;

import java.util.Scanner;

public class Ques20_Convert_Fahrenheit_To_Celsius {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter fahre:");
        double f= sc.nextDouble();
        double c=(f-32)*5/9;
        System.out.println("Celsius :"+c);
    }
}
