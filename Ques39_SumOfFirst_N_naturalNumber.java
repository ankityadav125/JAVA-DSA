package Numericals_100_Question;

import java.util.Scanner;

public class Ques39_SumOfFirst_N_naturalNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num : ");
        int num= sc.nextInt();
        int sum=num*(num+1)/2;
        System.out.println("Sum : "+sum);
    }
}
