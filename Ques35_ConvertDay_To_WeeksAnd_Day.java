package Numericals_100_Question;

import java.util.Scanner;

public class Ques35_ConvertDay_To_WeeksAnd_Day {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter days :");
        int days=sc.nextInt();
        System.out.println((days/7) + " Weeks and "+(days%7)+" days");
    }
}
