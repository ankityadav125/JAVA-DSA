package Numericals_100_Question;

import java.util.Scanner;

public class Ques40_CheckNumberIsPositive_Negative_Or_Zero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num : ");
        int num= sc.nextInt();
        if(num>0){
            System.out.println("Positive");
        } else if (num<0) {
            System.out.println("Negative");
        } else
            System.out.println("zero");
    }
}
